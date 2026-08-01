.class Lkevin/fun/hook/DYHook$2;
.super Landroid/view/ViewOutlineProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->showTopToast(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final val$safeContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    iput-object p1, p0, Lkevin/fun/hook/DYHook$2;->val$safeContext:Landroid/content/Context;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

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
    const-string v0, "E0pquclF5eCHRakeMbnz"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۟ۢۦۡ۟(Ljava/lang/Object;F)I
    .locals 2

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

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
    check-cast p0, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$smdp(Landroid/content/Context;F)I

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

.method public static ۣ۟ۨۤۤ(Ljava/lang/Object;)Landroid/content/Context;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$2;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$2;->val$safeContext:Landroid/content/Context;

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
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 8

    const/4 v1, 0x0

    const/4 v0, 0x0

    const/4 v5, 0x0

    const-string v2, "\u06e8\u06e7\u06e1"

    move-object v6, v0

    move v3, v1

    move v4, v1

    move v7, v1

    :goto_0
    invoke-static {v2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$2;->ۣ۟ۨۤۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v2, "\u06df\u06df\u06e2"

    move-object v6, v0

    goto :goto_0

    :sswitch_0
    int-to-float v5, v7

    const-string v0, "\u06df\u06e1\u06df"

    move-object v2, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p2

    move v2, v1

    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->۟ۥۨۤۦ(Ljava/lang/Object;IIIIF)V

    const-string v0, "\u06e2\u06e0\u06df"

    move-object v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۧۧۨ۟(Ljava/lang/Object;)I

    move-result v3

    const-string v0, "\u06e1\u06e6\u06e6"

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-static {v6, v0}, Lkevin/fun/hook/DYHook$2;->۟ۢۦۡ۟(Ljava/lang/Object;F)I

    move-result v7

    const-string v0, "\u06e8\u06e2\u06e6"

    move-object v2, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p1}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۟ۡ۠ۥۤ(Ljava/lang/Object;)I

    move-result v4

    const-string v0, "\u06e7\u06e1\u06e3"

    move-object v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa702 -> :sswitch_3
        0x1aa73d -> :sswitch_1
        0x1aaf61 -> :sswitch_4
        0x1ab261 -> :sswitch_5
        0x1ac92c -> :sswitch_0
        0x1ac9c2 -> :sswitch_2
    .end sparse-switch
.end method
