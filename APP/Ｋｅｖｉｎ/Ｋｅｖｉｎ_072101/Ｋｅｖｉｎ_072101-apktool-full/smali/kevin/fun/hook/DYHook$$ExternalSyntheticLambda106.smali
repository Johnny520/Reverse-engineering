.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda106;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:[I

.field public final f$2:Landroid/widget/LinearLayout;

.field public final f$3:Landroid/widget/LinearLayout;

.field public final f$4:Landroid/widget/LinearLayout;

.field public final f$5:[Landroid/widget/LinearLayout;

.field public final f$6:[Landroid/widget/LinearLayout;

.field public final f$7:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;[ILandroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;[Landroid/widget/LinearLayout;[Landroid/widget/LinearLayout;Ljava/lang/Runnable;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda106;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda106;->f$1:[I

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda106;->f$2:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda106;->f$3:Landroid/widget/LinearLayout;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda106;->f$4:Landroid/widget/LinearLayout;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda106;->f$5:[Landroid/widget/LinearLayout;

    iput-object p7, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda106;->f$6:[Landroid/widget/LinearLayout;

    iput-object p8, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda106;->f$7:Ljava/lang/Runnable;

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

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
    const-string v0, "8wr4ZPc8Xc3m9mAH4JLQUOA299uR"

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۨۤۨۦ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۣۧۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 9

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/DYHook;

    move-object v1, p1

    check-cast v1, [I

    move-object v2, p2

    check-cast v2, Landroid/widget/LinearLayout;

    move-object v3, p3

    check-cast v3, Landroid/widget/LinearLayout;

    move-object v4, p4

    check-cast v4, Landroid/widget/LinearLayout;

    move-object v5, p5

    check-cast v5, [Landroid/widget/LinearLayout;

    move-object v6, p6

    check-cast v6, [Landroid/widget/LinearLayout;

    move-object/from16 v7, p7

    check-cast v7, Ljava/lang/Runnable;

    move-object/from16 v8, p8

    check-cast v8, Landroid/view/View;

    invoke-virtual/range {v0 .. v8}, Lkevin/fun/hook/DYHook;->lambda$187$kevin-fun-hook-DYHook([ILandroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;[Landroid/widget/LinearLayout;[Landroid/widget/LinearLayout;Ljava/lang/Runnable;Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۦۦۨۢ()I

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
    const-string v0, "rz"

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟ۡ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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
    .locals 10

    const/4 v8, 0x0

    const-string v9, "\u06e8\u06e1\u06e0"

    move-object v1, v8

    move-object v2, v8

    move-object v3, v8

    move-object v7, v8

    move-object v4, v8

    move-object v0, v8

    move-object v5, v8

    move-object v6, v8

    :goto_0
    invoke-static {v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    invoke-static {p0}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۧۦ(Ljava/lang/Object;)[Landroid/widget/LinearLayout;

    move-result-object v6

    const-string v8, "\u06e5\u06e3\u06e0"

    move-object v9, v8

    goto :goto_0

    :sswitch_0
    move-object v8, p1

    invoke-static/range {v0 .. v8}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda106;->ۣۣۧۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "\u06e3\u06e2\u06e3"

    move-object v9, v8

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۨۦۦۦ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v3

    const-string v8, "\u06e2\u06e3\u06e3"

    move-object v9, v8

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۣۡۡ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v4

    const-string v8, "\u06e0\u06e4\u06e8"

    move-object v9, v8

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۡۧۧ(Ljava/lang/Object;)Ljava/lang/Runnable;

    move-result-object v7

    const-string v8, "\u06e1\u06e7\u06e2"

    move-object v9, v8

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟۠۠ۥۡ(Ljava/lang/Object;)[I

    move-result-object v1

    const-string v8, "\u06e7\u06e1\u06df"

    move-object v9, v8

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۤۢۡۨ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v8, "\u06e3\u06e0\u06e0"

    move-object v9, v8

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۡۤ۠(Ljava/lang/Object;)[Landroid/widget/LinearLayout;

    move-result-object v5

    const-string v8, "\u06e6\u06e4\u06e7"

    move-object v9, v8

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->۠ۥۢۧ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    const-string v8, "\u06e7\u06e0\u06e6"

    move-object v9, v8

    goto :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab64 -> :sswitch_6
        0x1aaf7c -> :sswitch_0
        0x1ab2c2 -> :sswitch_2
        0x1ab623 -> :sswitch_4
        0x1ab664 -> :sswitch_8
        0x1abe02 -> :sswitch_3
        0x1ac52d -> :sswitch_1
        0x1ac545 -> :sswitch_7
        0x1ac907 -> :sswitch_5
    .end sparse-switch
.end method
