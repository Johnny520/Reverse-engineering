.class public Lorg/apache/commons/io/filefilter/TrueFileFilter;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
.implements Ljava/io/Serializable;


# static fields
.field public static final INSTANCE:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

.field private static final TO_STRING:Ljava/lang/String;

.field public static final TRUE:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

.field private static final serialVersionUID:J = 0x79e1c04752927a87L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/commons/io/filefilter/TrueFileFilter;->TO_STRING:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Lorg/apache/commons/io/filefilter/TrueFileFilter;

    .line 10
    .line 11
    invoke-direct {v0}, Lorg/apache/commons/io/filefilter/TrueFileFilter;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lorg/apache/commons/io/filefilter/TrueFileFilter;->TRUE:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    sput-object v0, Lorg/apache/commons/io/filefilter/TrueFileFilter;->INSTANCE:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 0

    .line 1
    sget-object p0, Ljava/nio/file/FileVisitResult;->CONTINUE:Ljava/nio/file/FileVisitResult;

    .line 2
    .line 3
    return-object p0
.end method

.method public accept(Ljava/io/File;)Z
    .locals 0

    .line 5
    const/4 p0, 0x1

    return p0
.end method

.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 4
    const/4 p0, 0x1

    return p0
.end method

.method public and(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    return-object p1
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
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/io/filefilter/FalseFileFilter;->INSTANCE:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public or(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/io/filefilter/TrueFileFilter;->INSTANCE:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/commons/io/filefilter/TrueFileFilter;->TO_STRING:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
