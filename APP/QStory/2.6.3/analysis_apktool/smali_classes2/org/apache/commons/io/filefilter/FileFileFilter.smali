.class public Lorg/apache/commons/io/filefilter/FileFileFilter;
.super L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final FILE:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final INSTANCE:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

.field private static final serialVersionUID:J = 0x4a2e1f2e2788097eL


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/FileFileFilter;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/commons/io/filefilter/FileFileFilter;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/apache/commons/io/filefilter/FileFileFilter;->INSTANCE:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    sput-object v0, Lorg/apache/commons/io/filefilter/FileFileFilter;->FILE:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    new-array v0, p2, [Ljava/nio/file/LinkOption;

    .line 5
    .line 6
    invoke-static {p1, v0}, Ljava/nio/file/Files;->isRegularFile(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    :cond_0
    invoke-virtual {p0, p2}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->toFileVisitResult(Z)Ljava/nio/file/FileVisitResult;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->isFile(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public and(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/AndFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic matches(Ljava/nio/file/Path;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;->matches(Ljava/nio/file/Path;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public negate()L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/NotFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/apache/commons/io/filefilter/NotFileFilter;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public or(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/filefilter/OrFileFilter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/filefilter/OrFileFilter;-><init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
