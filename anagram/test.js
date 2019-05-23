const anagram = require('./anagram')
const assert = require('assert')

it('correctly determines if eat & tar are anagrams', () => {
    assert.equal(anagram.checkAnagram("eat", "tar"), false);
})

it('correctly determines if table & batel are anagrams', () => {
    assert.equal(anagram.checkAnagram("table", "batel"), true);
})

//add your tests here. 1st argument is method call and 2nd argument is your expected result.