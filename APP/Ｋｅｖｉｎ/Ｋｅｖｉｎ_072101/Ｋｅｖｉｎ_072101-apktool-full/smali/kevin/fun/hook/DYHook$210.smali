.class Lkevin/fun/hook/DYHook$210;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookBlockClickReply(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final val$commentRecyclerViewCls:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Ljava/lang/Class;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$210;->val$commentRecyclerViewCls:Ljava/lang/Class;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

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
    const-string v0, "QQspj9ayVv6a1bomlV4aUw"

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۤۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method public static ۟ۥۣۨۨ(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$210;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$210;->val$commentRecyclerViewCls:Ljava/lang/Class;

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

.method public static ۣۢۤۡ(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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
    .locals 9

    const/4 v8, 0x0

    const/4 v0, 0x0

    const-string v7, "\u06df\u06e2\u06e5"

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v6, v0

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {p1}, Lkevin/fun/hook/DYHook$210;->ۣۢۤۡ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const-string v7, "\u06e8\u06e5\u06e0"

    move-object v3, v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Lkevin/fun/hook/DYHook$210$1;

    invoke-direct {v0, p0, v5, v2}, Lkevin/fun/hook/DYHook$210$1;-><init>(Lkevin/fun/hook/DYHook$210;Ljava/lang/Class;Landroid/view/View$OnTouchListener;)V

    const-string v7, "\u06e6\u06e3\u06e3"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "\u06e8\u06e0\u06e0"

    move-object v7, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p1}, Lkevin/fun/hook/DYHook$210;->ۣۢۤۡ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const-string v7, "\u06e6\u06e4\u06df"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v1

    check-cast v0, Landroid/view/View$OnTouchListener;

    const-string v7, "\u06e2\u06e5\u06df"

    move-object v2, v0

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DYHook$210;->۟ۥۣۨۨ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    const-string v7, "\u06df\u06e8\u06e8"

    move-object v5, v0

    goto :goto_0

    :sswitch_6
    aget-object v1, v6, v8

    const-string v0, "\u06df\u06e1\u06e5"

    move-object v7, v0

    goto :goto_0

    :sswitch_7
    aput-object v4, v3, v8

    const-string v0, "\u06e4\u06e1\u06e8"

    move-object v7, v0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa743 -> :sswitch_4
        0x1aa762 -> :sswitch_3
        0x1aa81f -> :sswitch_1
        0x1ab2fc -> :sswitch_2
        0x1ac1c6 -> :sswitch_7
        0x1ac1e1 -> :sswitch_6
        0x1ac8e8 -> :sswitch_0
        0x1ac983 -> :sswitch_5
    .end sparse-switch
.end method
