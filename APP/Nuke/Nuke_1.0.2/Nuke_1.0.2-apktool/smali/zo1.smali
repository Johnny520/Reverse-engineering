.class public final Lzo1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# static fields
.field public static final b:Lzo1;

.field public static final c:Lzo1;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzo1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lzo1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lzo1;->b:Lzo1;

    .line 8
    .line 9
    new-instance v0, Lzo1;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lzo1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lzo1;->c:Lzo1;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lzo1;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ls12;Lt00;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Lzo1;->a:I

    .line 2
    .line 3
    sget-object v0, La83;->a:La83;

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    new-instance p0, Lyo1;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {p0, v2, v1}, Lw92;-><init>(ILt00;)V

    .line 14
    .line 15
    .line 16
    check-cast p1, Lzw2;

    .line 17
    .line 18
    invoke-virtual {p1, p0, p2}, Lzw2;->M0(Lmn0;Lt00;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Lk20;->h:Lk20;

    .line 23
    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    :cond_0
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
