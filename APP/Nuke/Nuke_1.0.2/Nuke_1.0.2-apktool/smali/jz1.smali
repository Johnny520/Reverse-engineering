.class public final Ljz1;
.super Lm3;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lzx0;
.implements Ljava/util/Collection;
.implements Lq41;


# static fields
.field public static final k:Ljz1;


# instance fields
.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Lzy1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljz1;

    .line 2
    .line 3
    sget-object v1, Lgd3;->v:Lgd3;

    .line 4
    .line 5
    sget-object v2, Lzy1;->j:Lzy1;

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2}, Ljz1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lzy1;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ljz1;->k:Ljz1;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lzy1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljz1;->h:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ljz1;->i:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Ljz1;->j:Lzy1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Ljz1;->j:Lzy1;

    .line 2
    .line 3
    iget p0, p0, Lzy1;->i:I

    .line 4
    .line 5
    return p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ljz1;->j:Lzy1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lzy1;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lro0;

    .line 2
    .line 3
    iget-object v1, p0, Ljz1;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ljz1;->j:Lzy1;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lro0;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
