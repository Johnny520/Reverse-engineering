--[[
    Hello World 示例脚本
    演示基本的 Lua 语法和 Cherry API
]]

print("=== Hello from Lua! ===")

-- 使用 cherry API
cherry.log("脚本开始执行")

-- 显示 Toast
cherry.toast("Hello, Lua World!")

-- 获取当前时间
local timestamp = cherry.time()
print("当前时间戳: " .. timestamp)

-- 测试配置存储
cherry.config.set("test_key", "hello_value")
local value = cherry.config.get("test_key")
print("配置读取测试: " .. (value or "nil"))

-- 返回结果
return {
    success = true,
    message = "Hello script executed!",
    timestamp = timestamp
}
