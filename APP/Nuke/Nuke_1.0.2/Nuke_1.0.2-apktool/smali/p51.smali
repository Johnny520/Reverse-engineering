.class public final Lp51;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:I

.field public final b:Lzj1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x12c

    .line 5
    .line 6
    iput v0, p0, Lp51;->a:I

    .line 7
    .line 8
    sget-object v0, Ly01;->a:Lzj1;

    .line 9
    .line 10
    new-instance v0, Lzj1;

    .line 11
    .line 12
    invoke-direct {v0}, Lzj1;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lp51;->b:Lzj1;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Float;I)Lo51;
    .locals 2

    .line 1
    new-instance v0, Lo51;

    .line 2
    .line 3
    sget-object v1, Lhd0;->b:Lc80;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lo51;-><init>(Ljava/lang/Float;Lgd0;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lp51;->b:Lzj1;

    .line 9
    .line 10
    invoke-virtual {p0, p2, v0}, Lzj1;->h(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
