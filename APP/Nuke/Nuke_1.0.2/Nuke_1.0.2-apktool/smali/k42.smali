.class public final Lk42;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final b:Lno;

.field public static final c:Ljava/util/List;

.field public static final d:Lk42;


# instance fields
.field public final a:Lkj1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    const/16 v2, 0x2a

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-byte v2, v1, v3

    .line 8
    .line 9
    new-instance v2, Lno;

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {v2, v0}, Lno;-><init>([B)V

    .line 16
    .line 17
    .line 18
    sput-object v2, Lk42;->b:Lno;

    .line 19
    .line 20
    const-string v0, "*"

    .line 21
    .line 22
    invoke-static {v0}, Leu;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lk42;->c:Ljava/util/List;

    .line 27
    .line 28
    new-instance v0, Lk42;

    .line 29
    .line 30
    new-instance v1, Lkj1;

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    invoke-direct {v1, v2}, Lkj1;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1}, Lk42;-><init>(Lkj1;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lk42;->d:Lk42;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Lkj1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk42;->a:Lkj1;

    .line 5
    .line 6
    return-void
.end method
