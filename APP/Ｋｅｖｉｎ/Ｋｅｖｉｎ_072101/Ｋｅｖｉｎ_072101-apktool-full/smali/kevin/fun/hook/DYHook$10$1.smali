.class Lkevin/fun/hook/DYHook$10$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/function/Predicate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook$10;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/function/Predicate",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$1:Lkevin/fun/hook/DYHook$10;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$10$1;->short:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x7f2s
        0x7ees
        0x7e3s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook$10;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$10$1;->this$1:Lkevin/fun/hook/DYHook$10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

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
    const-string v0, "2tJnaUVRBAPbVHb51qJNO9BzEDDf8"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۟ۡۢۤ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

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
    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

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

.method public static ۣ۟ۧ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$misUidHidden(Lkevin/fun/hook/DYHook;Ljava/lang/String;)Z

    move-result v0

    :sswitch_3
    return v0

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

.method public static ۣ۠ۧۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$10;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$10;->access$0(Lkevin/fun/hook/DYHook$10;)Lkevin/fun/hook/DYHook;

    move-result-object v0

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

.method public static ۤ۟ۢۢ()[S
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DYHook$10$1;->short:[S

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

.method public static ۣۣۨۤ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$10;
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$10$1;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$10$1;->this$1:Lkevin/fun/hook/DYHook$10;

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
.method public test(Ljava/lang/Object;)Z
    .locals 11

    const/4 v8, 0x0

    const/4 v0, 0x0

    const-string v6, "\u06e8\u06e5\u06e1"

    move-object v2, v0

    move-object v3, v0

    move-object v1, v0

    move-object v4, v0

    move-object v5, v0

    move v7, v8

    move v9, v8

    move v10, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p1, v5}, Lkevin/fun/hook/DYHook$10$1;->۟ۡۢۤ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e0\u06e0\u06e7"

    move-object v6, v0

    goto :goto_0

    :sswitch_0
    const/16 v0, 0x787

    invoke-static {v3, v8, v10, v0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v6, "\u06e0\u06e5\u06df"

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    sget v9, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    const-string v0, "\u06df\u06e8\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v5}, Lkevin/fun/hook/DYHook$10$1;->ۣ۟ۧ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const-string v0, "\u06e6\u06e7\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v10, v9, 0x381

    const-string v0, "\u06e8\u06e3\u06e3"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    const-string v6, "\u06e2\u06e1\u06e4"

    move-object v5, v0

    goto :goto_0

    :sswitch_5
    invoke-static {v4}, Lkevin/fun/hook/DYHook$10$1;->ۣ۠ۧۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v6, "\u06e0\u06e4\u06e0"

    move-object v2, v0

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/DYHook$10$1;->ۤ۟ۢۢ()[S

    move-result-object v0

    const-string v6, "\u06e2\u06e8\u06e4"

    move-object v3, v0

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/DYHook$10$1;->ۣۣۨۤ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$10;

    move-result-object v0

    const-string v6, "\u06e4\u06e1"

    move-object v4, v0

    goto :goto_0

    :sswitch_8
    return v7

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7d -> :sswitch_5
        0x1aa817 -> :sswitch_3
        0x1aaae7 -> :sswitch_4
        0x1aab5c -> :sswitch_2
        0x1ab285 -> :sswitch_7
        0x1ab35e -> :sswitch_1
        0x1ac245 -> :sswitch_8
        0x1ac948 -> :sswitch_0
        0x1ac984 -> :sswitch_6
    .end sparse-switch
.end method
