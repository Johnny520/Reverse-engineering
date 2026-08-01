.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:[Z

.field public final f$1:Landroid/widget/TextView;

.field public final f$2:Landroid/widget/LinearLayout;

.field public final f$3:Ljava/util/Map;

.field public final f$4:Landroid/widget/TextView;

.field public final f$5:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>([ZLandroid/widget/TextView;Landroid/widget/LinearLayout;Ljava/util/Map;Landroid/widget/TextView;Ljava/lang/Runnable;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda6;->f$0:[Z

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda6;->f$1:Landroid/widget/TextView;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda6;->f$2:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda6;->f$3:Ljava/util/Map;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda6;->f$4:Landroid/widget/TextView;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda6;->f$5:Ljava/lang/Runnable;

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

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
    const-string v0, "5gMjarF4moTQXLwOy"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static ۣۣ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, [Z

    move-object v1, p1

    check-cast v1, Landroid/widget/TextView;

    move-object v2, p2

    check-cast v2, Landroid/widget/LinearLayout;

    move-object v3, p3

    check-cast v3, Ljava/util/Map;

    move-object v4, p4

    check-cast v4, Landroid/widget/TextView;

    move-object v5, p5

    check-cast v5, Ljava/lang/Runnable;

    move-object v6, p6

    check-cast v6, Landroid/view/View;

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/DYHook;->lambda$59([ZLandroid/widget/TextView;Landroid/widget/LinearLayout;Ljava/util/Map;Landroid/widget/TextView;Ljava/lang/Runnable;Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "VvxlvLNrzZBshGu8gSlvD2k0sjwo6"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۧۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    const/4 v6, 0x0

    const-string v7, "\u06e0\u06e1\u06e2"

    move-object v3, v6

    move-object v0, v6

    move-object v4, v6

    move-object v1, v6

    move-object v2, v6

    move-object v5, v6

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda6;->ۣۣ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e7\u06e1\u06df"

    move-object v7, v6

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۡۡۤۢ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    const-string v6, "\u06e5\u06e2\u06e3"

    move-object v7, v6

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۣ۟ۧ(Ljava/lang/Object;)Ljava/lang/Runnable;

    move-result-object v5

    const-string v6, "\u06e2\u06e7\u06df"

    move-object v7, v6

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۦۨۤۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    const-string v6, "\u06e4\u06e6\u06e0"

    move-object v7, v6

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟ۧۢۨ۠(Ljava/lang/Object;)[Z

    move-result-object v0

    const-string v6, "\u06e0\u06e0\u06e3"

    move-object v7, v6

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->۟۠۠۠ۡ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    const-string v6, "\u06e0\u06df\u06e6"

    move-object v7, v6

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۤۡۡ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v4

    const-string v6, "\u06e2\u06e1\u06e1"

    move-object v7, v6

    goto :goto_0

    :sswitch_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaac7 -> :sswitch_5
        0x1aaae3 -> :sswitch_2
        0x1aab01 -> :sswitch_3
        0x1ab282 -> :sswitch_1
        0x1aba9e -> :sswitch_0
        0x1abde6 -> :sswitch_4
        0x1ac545 -> :sswitch_6
    .end sparse-switch
.end method
