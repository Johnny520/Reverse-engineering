.class public final Loq0;
.super Ll0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/util/Collection;
.implements Lp40;


# static fields
.field public static final g:Loq0;


# instance fields
.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Lgq0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Loq0;

    .line 2
    .line 3
    sget-object v1, Ln2;->D:Ln2;

    .line 4
    .line 5
    sget-object v2, Lgq0;->f:Lgq0;

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2}, Loq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lgq0;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Loq0;->g:Loq0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lgq0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loq0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Loq0;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Loq0;->f:Lgq0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Loq0;->f:Lgq0;

    .line 2
    .line 3
    iget p0, p0, Lgq0;->e:I

    .line 4
    .line 5
    return p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Loq0;->f:Lgq0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lgq0;->containsKey(Ljava/lang/Object;)Z

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
    new-instance v0, Lkx;

    .line 2
    .line 3
    iget-object v1, p0, Loq0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Loq0;->f:Lgq0;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lkx;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
