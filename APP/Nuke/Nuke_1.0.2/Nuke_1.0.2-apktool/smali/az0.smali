.class public final Laz0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lgu2;


# instance fields
.field public h:Ljava/lang/Float;

.field public i:Ljava/lang/Float;

.field public final j:Lnx1;

.field public k:Lcy2;

.field public l:Z

.field public m:Z

.field public n:J

.field public final synthetic o:Lcz0;


# direct methods
.method public constructor <init>(Lcz0;Ljava/lang/Float;Ljava/lang/Float;Lzy0;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laz0;->o:Lcz0;

    .line 5
    .line 6
    iput-object p2, p0, Laz0;->h:Ljava/lang/Float;

    .line 7
    .line 8
    iput-object p3, p0, Laz0;->i:Ljava/lang/Float;

    .line 9
    .line 10
    invoke-static {p2}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Laz0;->j:Lnx1;

    .line 15
    .line 16
    new-instance v0, Lcy2;

    .line 17
    .line 18
    iget-object v3, p0, Laz0;->h:Ljava/lang/Float;

    .line 19
    .line 20
    iget-object v4, p0, Laz0;->i:Ljava/lang/Float;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    sget-object v2, Lrg3;->n:Ln43;

    .line 24
    .line 25
    move-object v1, p4

    .line 26
    invoke-direct/range {v0 .. v5}, Lcy2;-><init>(Lhd;Ln43;Ljava/lang/Object;Ljava/lang/Object;Lnd;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Laz0;->k:Lcy2;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Laz0;->j:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
