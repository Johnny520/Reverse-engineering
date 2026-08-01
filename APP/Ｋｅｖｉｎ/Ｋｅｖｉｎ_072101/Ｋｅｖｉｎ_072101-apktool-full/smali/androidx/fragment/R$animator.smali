.class public final Landroidx/fragment/R$animator;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "animator"
.end annotation


# static fields
.field public static fragment_close_enter:I

.field public static fragment_close_exit:I

.field public static fragment_fade_enter:I

.field public static fragment_fade_exit:I

.field public static fragment_open_enter:I

.field public static fragment_open_exit:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x7f020000

    sput v0, Landroidx/fragment/R$animator;->fragment_close_enter:I

    const v0, 0x7f020001

    sput v0, Landroidx/fragment/R$animator;->fragment_close_exit:I

    const v0, 0x7f020002

    sput v0, Landroidx/fragment/R$animator;->fragment_fade_enter:I

    const v0, 0x7f020003

    sput v0, Landroidx/fragment/R$animator;->fragment_fade_exit:I

    const v0, 0x7f020004

    sput v0, Landroidx/fragment/R$animator;->fragment_open_enter:I

    const v0, 0x7f020005

    sput v0, Landroidx/fragment/R$animator;->fragment_open_exit:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

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
    const-string v0, "m4cCPVrZ4NcQErwzSP4T52oA2ZtKK"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۟ۧۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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
