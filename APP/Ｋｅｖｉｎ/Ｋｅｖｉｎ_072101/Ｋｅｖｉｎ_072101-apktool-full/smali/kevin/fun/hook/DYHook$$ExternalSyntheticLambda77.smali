.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda77;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final f$0:Ljava/util/Map;

.field public final f$1:I

.field public final f$2:Landroid/widget/TextView;

.field public final f$3:Landroid/widget/TextView;

.field public final f$4:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;ILandroid/widget/TextView;Landroid/widget/TextView;Ljava/util/List;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda77;->f$0:Ljava/util/Map;

    iput p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda77;->f$1:I

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda77;->f$2:Landroid/widget/TextView;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda77;->f$3:Landroid/widget/TextView;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda77;->f$4:Ljava/util/List;

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

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
    const-string v0, "mbdK0SDQIIOAcF8xztr81JE"

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۧۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۟ۡۨۤۤ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 7

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

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
    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    move-object v2, p2

    check-cast v2, Landroid/widget/TextView;

    move-object v3, p3

    check-cast v3, Landroid/widget/TextView;

    move-object v4, p4

    check-cast v4, Ljava/util/List;

    move-object v5, p5

    check-cast v5, Landroid/widget/CompoundButton;

    move v1, p1

    move v6, p6

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/DYHook;->lambda$65(Ljava/util/Map;ILandroid/widget/TextView;Landroid/widget/TextView;Ljava/util/List;Landroid/widget/CompoundButton;Z)V

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

    const-string v6, "\u06e6\u06e3\u06df"

    move-object v0, v5

    move-object v2, v5

    move-object v4, v5

    move-object v3, v5

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    invoke-static {p0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v1

    const-string v5, "\u06e3\u06e0\u06df"

    move-object v6, v5

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۤۤۢۨ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v5, "\u06e0\u06e8\u06e7"

    move-object v6, v5

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤۡۤۡ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v2

    const-string v5, "\u06df\u06e1\u06e6"

    move-object v6, v5

    goto :goto_0

    :sswitch_2
    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda77;->۟ۡۨۤۤ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    const-string v5, "\u06e3\u06e5\u06e3"

    move-object v6, v5

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟۟۟ۦۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v3

    const-string v5, "\u06e6\u06e3\u06e1"

    move-object v6, v5

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/activity/ۤۧۧۧ;->ۨۧۤۡ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, "\u06e6\u06e8\u06e5"

    move-object v6, v5

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa744 -> :sswitch_3
        0x1ab622 -> :sswitch_1
        0x1ab6c1 -> :sswitch_5
        0x1ac1c2 -> :sswitch_0
        0x1ac1c4 -> :sswitch_4
        0x1ac263 -> :sswitch_2
    .end sparse-switch
.end method
