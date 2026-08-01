.class public final Lbsh/classpath/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static 飘花落叶言子楪哲世兰苏:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

.field public static 飘花落叶言子楪哲世苏兰:[Ljava/net/URL;

.field public static 飘花落叶言子楪哲苏世兰:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

.field public static final 飘花落叶言子楪苏兰世哲:Ljava/util/regex/Pattern;

.field public static final 飘花落叶言子楪苏兰哲世:Ljava/util/regex/Pattern;

.field public static final 飘花落叶言子楪苏哲世兰:Ljava/util/regex/Pattern;

.field public static final 飘花落叶言子楪苏哲兰世:Ljava/util/regex/Pattern;


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Z

.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;

.field public final 飘花落叶言子楪苏世兰哲:Ljava/util/Vector;

.field public 飘花落叶言子楪苏世哲兰:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "[/\\\\]"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "^modules/[^/]+/"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "\\.[^\\.]+$"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰世哲:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "\\.(?=[^.]+$)"

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 9
    .line 10
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 15
    .line 16
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v2, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v3, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    new-instance v4, Ljava/util/Vector;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/util/Vector;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v4, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲:Ljava/util/Vector;

    .line 36
    .line 37
    iput-object p1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    iput-boolean p1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:Z

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-object p1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/net/URL;)V
    .locals 1

    .line 58
    invoke-direct {p0, p1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;-><init>(Ljava/lang/String;)V

    .line 59
    iget-object p1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->addAll(Ljava/util/Collection;)Z

    .line 60
    iget-boolean p1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:Z

    if-eqz p1, :cond_0

    .line 61
    invoke-virtual {p0, p2}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰世哲([Ljava/net/URL;)V

    :cond_0
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏()Ljava/net/URL;
    .locals 4

    .line 1
    const-class v0, Ljava/lang/Class;

    .line 2
    .line 3
    const-string v1, "/java/lang/String.class"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "jrt:/"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Ljava/net/URL;

    .line 22
    .line 23
    const/16 v2, 0x2f

    .line 24
    .line 25
    const/4 v3, 0x5

    .line 26
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->indexOf(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_0
    new-instance v1, Ljava/net/URL;

    .line 40
    .line 41
    const-string v2, "[^!]*$"

    .line 42
    .line 43
    const-string v3, "/"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public static 飘花落叶言子楪世哲兰苏()Lbsh/classpath/飘花落叶言子楪苏兰世哲;
    .locals 4

    .line 1
    sget-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    new-instance v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 6
    .line 7
    const-string v1, "Boot Class Path"

    .line 8
    .line 9
    invoke-static {}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏()Ljava/net/URL;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    filled-new-array {v2}, [Ljava/net/URL;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;-><init>(Ljava/lang/String;[Ljava/net/URL;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰:Lbsh/classpath/飘花落叶言子楪苏兰世哲;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    new-instance v1, Lbsh/ClassPathException;

    .line 25
    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v3, " can\'t find boot jar: "

    .line 29
    .line 30
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-direct {v1, v2, v0}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :cond_0
    :goto_0
    sget-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 45
    .line 46
    return-object v0
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v1, "Mapping: "

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "modules/"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    const/16 v0, 0x2f

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const-string v2, "."

    .line 28
    .line 29
    if-gez v0, :cond_1

    .line 30
    .line 31
    const/16 v0, 0x5c

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ltz v0, :cond_2

    .line 38
    .line 39
    :cond_1
    sget-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :cond_2
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :cond_3
    const-string v0, "class "

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    const/4 v0, 0x6

    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :cond_4
    const-string v0, "classes."

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    const/16 v0, 0x8

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    :cond_5
    const-string v0, ".class"

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    sget-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰世哲:Ljava/util/regex/Pattern;

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :cond_6
    return-object p0
.end method

.method public static 飘花落叶言子楪苏世哲兰()Lbsh/classpath/飘花落叶言子楪苏兰世哲;
    .locals 7

    .line 1
    sget-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    new-instance v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 6
    .line 7
    sget-object v1, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世苏兰:[Ljava/net/URL;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    const-string v1, "java.class.path"

    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-array v1, v2, [Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    sget-object v3, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    array-length v3, v1

    .line 31
    new-array v3, v3, [Ljava/net/URL;

    .line 32
    .line 33
    :goto_1
    :try_start_0
    array-length v4, v1

    .line 34
    if-ge v2, v4, :cond_2

    .line 35
    .line 36
    new-instance v4, Ljava/io/File;

    .line 37
    .line 38
    new-instance v5, Ljava/io/File;

    .line 39
    .line 40
    aget-object v6, v1, v2

    .line 41
    .line 42
    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/io/File;->toURI()Ljava/net/URI;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    aput-object v4, v3, v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    sput-object v3, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世苏兰:[Ljava/net/URL;

    .line 66
    .line 67
    move-object v1, v3

    .line 68
    :goto_2
    const-string v2, "User Class Path"

    .line 69
    .line 70
    invoke-direct {v0, v2, v1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;-><init>(Ljava/lang/String;[Ljava/net/URL;)V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :catch_0
    move-exception v0

    .line 77
    new-instance v1, Lbsh/ClassPathException;

    .line 78
    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v3, "can\'t parse class path: "

    .line 82
    .line 83
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-direct {v1, v2, v0}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw v1

    .line 97
    :cond_3
    :goto_3
    sget-object v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 98
    .line 99
    return-object v0
.end method

.method public static 飘花落叶言子楪苏兰哲世(Ljava/io/File;Ljava/io/File;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    new-array p1, v2, [Ljava/io/File;

    .line 18
    .line 19
    :cond_0
    :goto_0
    array-length v3, p1

    .line 20
    if-ge v2, v3, :cond_4

    .line 21
    .line 22
    aget-object v3, p1, v2

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    invoke-static {p0, v3}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世(Ljava/io/File;Ljava/io/File;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const-string v5, ".class"

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v3}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const-string p0, "problem parsing paths"

    .line 79
    .line 80
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    return-object p0

    .line 85
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BshClassPath "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "("

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ") path= "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "\ncompPaths = {"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, " }"

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lbsh/classpath/飘花落叶言子楪苏世兰哲;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lbsh/classpath/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, v1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Z)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lbsh/classpath/飘花落叶言子楪苏世兰哲;

    .line 27
    .line 28
    :goto_0
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lbsh/classpath/飘花落叶言子楪苏世兰哲;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lbsh/classpath/飘花落叶言子楪苏兰世哲;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲:Ljava/util/Vector;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 8
    .line 9
    const-string v1, "Start ClassPath Mapping"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    new-instance v0, Lbsh/classpath/飘花落叶言子楪世哲苏兰;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1}, Lbsh/classpath/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->forEach(Ljava/util/function/Consumer;)V

    .line 23
    .line 24
    .line 25
    iget-boolean v0, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:Z

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    new-array v0, v0, [Ljava/net/URL;

    .line 31
    .line 32
    iget-object v1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, [Ljava/net/URL;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰世哲([Ljava/net/URL;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    if-eqz p1, :cond_2

    .line 44
    .line 45
    iget-boolean p1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:Z

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 50
    .line 51
    const-string v0, "End ClassPath Mapping"

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:Z

    .line 58
    .line 59
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲([Ljava/net/URL;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    :try_start_0
    aget-object v1, p1, v0

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰(Ljava/net/URL;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Error constructing classpath: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    aget-object p1, p1, v0

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p1, ": "

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string p1, "Failed to map class path "

    .line 44
    .line 45
    invoke-static {v0, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(Ljava/net/URL;)V
    .locals 6

    .line 1
    const-string v0, "jrt"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, "FileSystem: "

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    new-instance v0, Ljava/net/URI;

    .line 33
    .line 34
    const-string v3, "jrt:/"

    .line 35
    .line 36
    invoke-direct {v0, v3}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Ljava/nio/file/FileSystems;->getFileSystem(Ljava/net/URI;)Ljava/nio/file/FileSystem;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v3, "modules"

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    filled-new-array {v4}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v0, v3, v4}, Ljava/nio/file/FileSystem;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 54
    .line 55
    .line 56
    move-result-object v0
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_1

    .line 57
    :try_start_1
    new-array v3, v2, [Ljava/nio/file/FileVisitOption;

    .line 58
    .line 59
    invoke-static {v0, v3}, Ljava/nio/file/Files;->walk(Ljava/nio/file/Path;[Ljava/nio/file/FileVisitOption;)Ljava/util/stream/Stream;

    .line 60
    .line 61
    .line 62
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 63
    :try_start_2
    new-instance v3, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 64
    .line 65
    invoke-direct {v3, v2}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-instance v4, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 73
    .line 74
    invoke-direct {v4, v2}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    new-instance v4, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 82
    .line 83
    invoke-direct {v4, v1}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v3, Lbsh/classpath/飘花落叶言子楪世兰哲苏;

    .line 91
    .line 92
    invoke-direct {v3, v2}, Lbsh/classpath/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v1, v3}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, [Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    .line 101
    :try_start_3
    invoke-interface {v0}, Ljava/util/stream/BaseStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :catch_0
    move-exception v0

    .line 106
    goto :goto_1

    .line 107
    :catchall_0
    move-exception v1

    .line 108
    if-eqz v0, :cond_0

    .line 109
    .line 110
    :try_start_4
    invoke-interface {v0}, Ljava/util/stream/BaseStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    :try_start_5
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    :cond_0
    :goto_0
    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 119
    :goto_1
    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/net/URISyntaxException; {:try_start_6 .. :try_end_6} :catch_1

    .line 120
    :catch_1
    new-array v1, v2, [Ljava/lang/String;

    .line 121
    .line 122
    :goto_2
    new-instance v0, Lbsh/classpath/飘花落叶言子楪苏哲世兰;

    .line 123
    .line 124
    const/4 v2, 0x2

    .line 125
    invoke-direct {v0, v2}, Lbsh/classpath/飘花落叶言子楪苏哲世兰;-><init>(I)V

    .line 126
    .line 127
    .line 128
    iput-object p1, v0, Lbsh/classpath/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/io/Serializable;

    .line 129
    .line 130
    invoke-virtual {p0, v1, v0}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世([Ljava/lang/String;Lbsh/classpath/飘花落叶言子楪苏世兰哲;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_6

    .line 134
    .line 135
    :cond_1
    const-string v0, "jar"

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :try_start_7
    invoke-virtual {p1}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    new-instance v3, Ljava/util/HashMap;

    .line 167
    .line 168
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-static {v0, v3}, Ljava/nio/file/FileSystems;->newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ljava/nio/file/FileSystem;
    :try_end_7
    .catch Ljava/nio/file/FileSystemAlreadyExistsException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/net/URISyntaxException; {:try_start_7 .. :try_end_7} :catch_4

    .line 172
    .line 173
    .line 174
    :catch_2
    :try_start_8
    invoke-virtual {p1}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Ljava/nio/file/FileSystems;->getFileSystem(Ljava/net/URI;)Ljava/nio/file/FileSystem;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    const-string v3, "/"

    .line 183
    .line 184
    new-array v4, v2, [Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v0, v3, v4}, Ljava/nio/file/FileSystem;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;

    .line 187
    .line 188
    .line 189
    move-result-object v0
    :try_end_8
    .catch Ljava/net/URISyntaxException; {:try_start_8 .. :try_end_8} :catch_4

    .line 190
    :try_start_9
    new-array v3, v2, [Ljava/nio/file/FileVisitOption;

    .line 191
    .line 192
    invoke-static {v0, v3}, Ljava/nio/file/Files;->walk(Ljava/nio/file/Path;[Ljava/nio/file/FileVisitOption;)Ljava/util/stream/Stream;

    .line 193
    .line 194
    .line 195
    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    .line 196
    :try_start_a
    new-instance v3, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 197
    .line 198
    invoke-direct {v3, v2}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v0, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    new-instance v4, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 206
    .line 207
    invoke-direct {v4, v2}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    new-instance v4, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    .line 215
    .line 216
    invoke-direct {v4, v1}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    new-instance v4, Lbsh/classpath/飘花落叶言子楪世兰哲苏;

    .line 224
    .line 225
    invoke-direct {v4, v1}, Lbsh/classpath/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    check-cast v1, [Ljava/lang/String;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 233
    .line 234
    :try_start_b
    invoke-interface {v0}, Ljava/util/stream/BaseStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :catch_3
    move-exception v0

    .line 239
    goto :goto_4

    .line 240
    :catchall_2
    move-exception v1

    .line 241
    if-eqz v0, :cond_2

    .line 242
    .line 243
    :try_start_c
    invoke-interface {v0}, Ljava/util/stream/BaseStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :catchall_3
    move-exception v0

    .line 248
    :try_start_d
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    :cond_2
    :goto_3
    throw v1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3

    .line 252
    :goto_4
    :try_start_e
    throw v0
    :try_end_e
    .catch Ljava/net/URISyntaxException; {:try_start_e .. :try_end_e} :catch_4

    .line 253
    :catch_4
    new-array v1, v2, [Ljava/lang/String;

    .line 254
    .line 255
    :goto_5
    new-instance v0, Lbsh/classpath/飘花落叶言子楪苏哲兰世;

    .line 256
    .line 257
    invoke-direct {v0, p1}, Lbsh/classpath/飘花落叶言子楪苏哲兰世;-><init>(Ljava/net/URL;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, v1, v0}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世([Ljava/lang/String;Lbsh/classpath/飘花落叶言子楪苏世兰哲;)V

    .line 261
    .line 262
    .line 263
    :goto_6
    return-void

    .line 264
    :cond_3
    invoke-virtual {p1}, Ljava/net/URL;->getFile()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    new-instance v3, Ljava/io/File;

    .line 269
    .line 270
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-eqz v4, :cond_4

    .line 278
    .line 279
    new-instance p1, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    const-string v0, "Directory "

    .line 282
    .line 283
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-static {p1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v3, v3}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世(Ljava/io/File;Ljava/io/File;)Ljava/util/ArrayList;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    new-array v0, v0, [Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    check-cast p1, [Ljava/lang/String;

    .line 315
    .line 316
    new-instance v0, Lbsh/classpath/飘花落叶言子楪苏哲世兰;

    .line 317
    .line 318
    invoke-direct {v0, v2}, Lbsh/classpath/飘花落叶言子楪苏哲世兰;-><init>(I)V

    .line 319
    .line 320
    .line 321
    iput-object v3, v0, Lbsh/classpath/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/io/Serializable;

    .line 322
    .line 323
    invoke-virtual {p0, p1, v0}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世([Ljava/lang/String;Lbsh/classpath/飘花落叶言子楪苏世兰哲;)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    const-string v3, ".jar"

    .line 332
    .line 333
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-nez v3, :cond_6

    .line 338
    .line 339
    const-string v3, ".zip"

    .line 340
    .line 341
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-nez v3, :cond_6

    .line 346
    .line 347
    const-string v3, ".jmod"

    .line 348
    .line 349
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    if-eqz v2, :cond_5

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_5
    const-string p0, "Not a classpath component: "

    .line 357
    .line 358
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 363
    .line 364
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :cond_6
    :goto_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    const-string v2, "Archive: "

    .line 371
    .line 372
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-static {v0}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    new-instance v0, Ljava/util/ArrayList;

    .line 386
    .line 387
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 388
    .line 389
    .line 390
    new-instance v2, Ljava/util/zip/ZipInputStream;

    .line 391
    .line 392
    invoke-virtual {p1}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-direct {v2, v3}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 397
    .line 398
    .line 399
    :cond_7
    :goto_8
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->available()I

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    if-ne v3, v1, :cond_8

    .line 404
    .line 405
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    if-eqz v3, :cond_7

    .line 410
    .line 411
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    const-string v5, ".class"

    .line 420
    .line 421
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    if-eqz v4, :cond_7

    .line 426
    .line 427
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    invoke-static {v3}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    goto :goto_8

    .line 439
    :cond_8
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->close()V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    new-array v1, v1, [Ljava/lang/String;

    .line 447
    .line 448
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    check-cast v0, [Ljava/lang/String;

    .line 453
    .line 454
    new-instance v1, Lbsh/classpath/飘花落叶言子楪苏哲兰世;

    .line 455
    .line 456
    invoke-direct {v1, p1}, Lbsh/classpath/飘花落叶言子楪苏哲兰世;-><init>(Ljava/net/URL;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {p0, v0, v1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世([Ljava/lang/String;Lbsh/classpath/飘花落叶言子楪苏世兰哲;)V

    .line 460
    .line 461
    .line 462
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世([Ljava/lang/String;Lbsh/classpath/飘花落叶言子楪苏世兰哲;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_3

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    invoke-static {v2}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const/16 v4, 0x2e

    .line 13
    .line 14
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/4 v5, -0x1

    .line 19
    if-ne v4, v5, :cond_0

    .line 20
    .line 21
    const-string v4, "<unpackaged>"

    .line 22
    .line 23
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    sget-object v4, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世:Ljava/util/regex/Pattern;

    .line 29
    .line 30
    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :goto_1
    aget-object v3, v3, v0

    .line 35
    .line 36
    iget-object v4, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ljava/util/Set;

    .line 43
    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    new-instance v5, Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-interface {v5, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 58
    .line 59
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v3, v2, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return-void
.end method
