.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda70;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final f$0:[Z

.field public final f$1:I

.field public final f$2:Ljava/lang/String;

.field public final f$3:Ljava/util/List;

.field public final f$4:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>([ZILjava/lang/String;Ljava/util/List;Landroid/widget/LinearLayout;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda70;->f$0:[Z

    iput p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda70;->f$1:I

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda70;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda70;->f$3:Ljava/util/List;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda70;->f$4:Landroid/widget/LinearLayout;

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

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
    const-string v0, "rQn2hBQG2gFNv1bdIYLyvrJLI"

    invoke-static {v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟۟ۢ۟ۦ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 7

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

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

    check-cast v0, [Z

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move-object v3, p3

    check-cast v3, Ljava/util/List;

    move-object v4, p4

    check-cast v4, Landroid/widget/LinearLayout;

    move-object v5, p5

    check-cast v5, Landroid/widget/CompoundButton;

    move v1, p1

    move v6, p6

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/DYHook;->lambda$137([ZILjava/lang/String;Ljava/util/List;Landroid/widget/LinearLayout;Landroid/widget/CompoundButton;Z)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

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
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e8\u06e3\u06e0"

    move-object v3, v5

    move-object v2, v5

    move-object v0, v5

    move-object v4, v5

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    invoke-static {p0}, Landroidx/customview/ۤۡۥ;->ۡۡۨۨ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v4

    const-string v5, "\u06e5\u06e4\u06e7"

    move-object v6, v5

    goto :goto_0

    :sswitch_0
    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda70;->۟۟ۢ۟ۦ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v5, "\u06e5\u06e5\u06e0"

    move-object v6, v5

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۢۧ۠ۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v5, "\u06e0\u06df\u06e7"

    move-object v6, v5

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/startup/۟ۦۤۨۧ;->ۨ۟ۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "\u06e5\u06e1\u06e8"

    move-object v6, v5

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۧۨۨ(Ljava/lang/Object;)I

    move-result v1

    const-string v5, "\u06e2\u06e5\u06e3"

    move-object v6, v5

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۥۥۣۧ(Ljava/lang/Object;)[Z

    move-result-object v0

    const-string v5, "\u06e3\u06e1\u06df"

    move-object v6, v5

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab300 -> :sswitch_2
        0x1ab641 -> :sswitch_3
        0x1abdcc -> :sswitch_1
        0x1abe28 -> :sswitch_0
        0x1abe40 -> :sswitch_5
        0x1ac945 -> :sswitch_4
    .end sparse-switch
.end method
