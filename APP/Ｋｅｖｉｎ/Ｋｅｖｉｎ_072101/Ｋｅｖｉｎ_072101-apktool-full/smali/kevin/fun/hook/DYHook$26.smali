.class Lkevin/fun/hook/DYHook$26;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookBottomSpace(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$26;->this$0:Lkevin/fun/hook/DYHook;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "RYBNHx71nRGL"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۟ۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠۠۠ۢ(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method protected beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e4\u06e0\u06e0"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v6}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "\u06e8\u06e3\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    aput-object v2, v0, v5

    const-string v1, "\u06e5\u06e1\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v4, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    const-string v1, "\u06e3\u06e5\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v6, v4, 0x28c

    const-string v1, "\u06e7\u06e2\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p1}, Lkevin/fun/hook/DYHook$26;->۠۠۠ۢ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u06e0\u06e8\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aabdd -> :sswitch_1
        0x1ab6c2 -> :sswitch_2
        0x1ab9e4 -> :sswitch_3
        0x1abdc5 -> :sswitch_4
        0x1ac949 -> :sswitch_0
    .end sparse-switch
.end method
