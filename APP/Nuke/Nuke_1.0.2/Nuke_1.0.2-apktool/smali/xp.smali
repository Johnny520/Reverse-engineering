.class public final Lxp;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lkj1;

.field public b:Lzp;

.field public c:[B

.field public d:I

.field public e:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Lkj1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxp;->a:Lkj1;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lxp;->b:Lzp;

    .line 8
    .line 9
    iput-object p1, p0, Lxp;->c:[B

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lxp;->d:I

    .line 13
    .line 14
    iput-object p1, p0, Lxp;->e:Ljava/util/TreeMap;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxp;->b:Lzp;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lxp;->a:Lkj1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lkj1;->v()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lkj1;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lzp;

    .line 13
    .line 14
    iput-object v0, p0, Lxp;->b:Lzp;

    .line 15
    .line 16
    :cond_0
    return-void
.end method
