--[[
    UI 交互示例
    演示如何在 Lua 中创建 UI 和处理事件
]]

print("=== UI Demo ===")

-- 导入必要的类
local AlertDialog = import("android.app.AlertDialog")
local AlertDialogBuilder = import("android.app.AlertDialog$Builder")
local DialogInterface = import("android.content.DialogInterface")
local View = import("android.view.View")
local Button = import("android.widget.Button")
local EditText = import("android.widget.EditText")
local LinearLayout = import("android.widget.LinearLayout")
local Toast = import("android.widget.Toast")

-- 在 UI 线程中执行
cherry.runOnUiThread(function()
    local activity = cherry.getActivity()
    if not activity then
        print("No activity available")
        return
    end

    -- 创建 AlertDialog
    local builder = AlertDialogBuilder(activity)
    builder:setTitle("Lua UI Demo")
    builder:setMessage("这个对话框是由 Lua 脚本创建的!\n\n选择一个操作:")

    -- 设置按钮点击事件
    builder:setPositiveButton("显示 Toast", function(dialog, which)
        Toast.makeText(activity, "你点击了确定按钮!", Toast.LENGTH_SHORT):show()
    end)

    builder:setNegativeButton("取消", function(dialog, which)
        print("用户点击了取消")
        dialog:dismiss()
    end)

    builder:setNeutralButton("更多信息", function(dialog, which)
        -- 显示另一个对话框
        cherry.alert("关于", "CherryWeChat Lua 引擎 v1.0\n\n支持完整的 Java 互操作!")
    end)

    -- 显示对话框
    local dialog = builder:create()
    dialog:show()

    print("Dialog shown successfully")
end)

-- 延迟执行示例
cherry.postDelayed(function()
    cherry.toast("3秒后的延迟消息")
end, 3000)

return "UI demo started"
