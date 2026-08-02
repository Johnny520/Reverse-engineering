.class public final Ldt1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public A:I

.field public B:I

.field public C:J

.field public D:Lhh1;

.field public E:Liy2;

.field public a:Lkj1;

.field public b:Ln4;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Lum2;

.field public f:Z

.field public g:Z

.field public h:Lgd3;

.field public i:Z

.field public j:Z

.field public k:Lsn;

.field public l:Lna0;

.field public m:Ljava/net/Proxy;

.field public n:Ljava/net/ProxySelector;

.field public o:Lgd3;

.field public p:Ljavax/net/SocketFactory;

.field public q:Ljavax/net/ssl/SSLSocketFactory;

.field public r:Ljavax/net/ssl/X509TrustManager;

.field public s:Ljava/util/List;

.field public t:Ljava/util/List;

.field public u:Lys1;

.field public v:Lcq;

.field public w:Lup0;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkj1;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, v1}, Lkj1;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ldt1;->a:Lkj1;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ldt1;->c:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ldt1;->d:Ljava/util/ArrayList;

    .line 25
    .line 26
    sget-object v0, Lwg3;->a:Ljava/util/TimeZone;

    .line 27
    .line 28
    new-instance v0, Lum2;

    .line 29
    .line 30
    const/16 v1, 0xd

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lum2;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ldt1;->e:Lum2;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Ldt1;->f:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Ldt1;->g:Z

    .line 41
    .line 42
    sget-object v1, Lgd3;->j:Lgd3;

    .line 43
    .line 44
    iput-object v1, p0, Ldt1;->h:Lgd3;

    .line 45
    .line 46
    iput-boolean v0, p0, Ldt1;->i:Z

    .line 47
    .line 48
    iput-boolean v0, p0, Ldt1;->j:Z

    .line 49
    .line 50
    sget-object v0, Lsn;->D:Lsn;

    .line 51
    .line 52
    iput-object v0, p0, Ldt1;->k:Lsn;

    .line 53
    .line 54
    sget-object v0, Lna0;->e:Lz8;

    .line 55
    .line 56
    iput-object v0, p0, Ldt1;->l:Lna0;

    .line 57
    .line 58
    iput-object v1, p0, Ldt1;->o:Lgd3;

    .line 59
    .line 60
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Ldt1;->p:Ljavax/net/SocketFactory;

    .line 68
    .line 69
    sget-object v0, Let1;->G:Ljava/util/List;

    .line 70
    .line 71
    iput-object v0, p0, Ldt1;->s:Ljava/util/List;

    .line 72
    .line 73
    sget-object v0, Let1;->F:Ljava/util/List;

    .line 74
    .line 75
    iput-object v0, p0, Ldt1;->t:Ljava/util/List;

    .line 76
    .line 77
    sget-object v0, Lys1;->a:Lys1;

    .line 78
    .line 79
    iput-object v0, p0, Ldt1;->u:Lys1;

    .line 80
    .line 81
    sget-object v0, Lcq;->c:Lcq;

    .line 82
    .line 83
    iput-object v0, p0, Ldt1;->v:Lcq;

    .line 84
    .line 85
    const/16 v0, 0x2710

    .line 86
    .line 87
    iput v0, p0, Ldt1;->y:I

    .line 88
    .line 89
    iput v0, p0, Ldt1;->z:I

    .line 90
    .line 91
    iput v0, p0, Ldt1;->A:I

    .line 92
    .line 93
    const v0, 0xea60

    .line 94
    .line 95
    .line 96
    iput v0, p0, Ldt1;->B:I

    .line 97
    .line 98
    const-wide/16 v0, 0x400

    .line 99
    .line 100
    iput-wide v0, p0, Ldt1;->C:J

    .line 101
    .line 102
    return-void
.end method
