.class public interface abstract L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/FileFilter;
.implements Ljava/io/FilenameFilter;
.implements Ljava/nio/file/PathMatcher;


# static fields
.field public static final 飘花落叶言子楪哲苏世兰:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    sput-object v0, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰:[Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
.end method

.method public abstract accept(Ljava/io/File;)Z
.end method

.method public abstract accept(Ljava/io/File;Ljava/lang/String;)Z
.end method

.method public abstract and(L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;)L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;
.end method

.method public matches(Ljava/nio/file/Path;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, v0}, L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;->accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    sget-object p1, Ljava/nio/file/FileVisitResult;->TERMINATE:Ljava/nio/file/FileVisitResult;

    .line 7
    .line 8
    if-eq p0, p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public abstract negate()L飘花落叶言苏子哲楪兰世/飘花落叶言子楪世兰苏哲;
.end method
