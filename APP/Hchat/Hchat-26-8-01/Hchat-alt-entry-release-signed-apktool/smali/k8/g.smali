.class public final Lk8/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final h:Ljava/util/regex/Pattern;

.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;

.field public static final k:Ljava/util/regex/Pattern;

.field public static final l:Ljava/util/regex/Pattern;

.field public static final m:Ljava/util/regex/Pattern;

.field public static final n:Ljava/util/regex/Pattern;

.field public static final o:Ljava/util/regex/Pattern;

.field public static final p:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final q:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final r:Ljava/util/concurrent/ExecutorService;

.field public static final s:Ljava/util/concurrent/ScheduledExecutorService;

.field public static final t:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field public final a:Lh/Hchat/dexkit/DexFinder;

.field public final b:Lm8/c;

.field public final c:Lg8/a;

.field public final d:Lg8/i;

.field public final e:Lk8/s;

.field public final f:Lf8/c;

.field public volatile g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "<appmsg\\b[^>]*\\bappid\\s*=\\s*([\"\'])(.*?)\\1"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lk8/g;->h:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    const-string v0, "<appid>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</appid>"

    .line 11
    .line 12
    const/16 v2, 0x22

    .line 13
    .line 14
    invoke-static {v0, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lk8/g;->i:Ljava/util/regex/Pattern;

    .line 19
    .line 20
    const-string v0, "<sourcedisplayname>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</sourcedisplayname>"

    .line 21
    .line 22
    invoke-static {v0, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lk8/g;->j:Ljava/util/regex/Pattern;

    .line 27
    .line 28
    const-string v0, "<msgsource\\b[^>]*>.*?</msgsource>"

    .line 29
    .line 30
    invoke-static {v0, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lk8/g;->k:Ljava/util/regex/Pattern;

    .line 35
    .line 36
    const-string v0, "<tpthumburl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</tpthumburl>"

    .line 37
    .line 38
    invoke-static {v0, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lk8/g;->l:Ljava/util/regex/Pattern;

    .line 43
    .line 44
    const-string v0, "<weappiconurl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</weappiconurl>"

    .line 45
    .line 46
    invoke-static {v0, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lk8/g;->m:Ljava/util/regex/Pattern;

    .line 51
    .line 52
    const-string v0, "<thumburl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</thumburl>"

    .line 53
    .line 54
    invoke-static {v0, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lk8/g;->n:Ljava/util/regex/Pattern;

    .line 59
    .line 60
    const-string v0, "<cdnthumburl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</cdnthumburl>"

    .line 61
    .line 62
    invoke-static {v0, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lk8/g;->o:Ljava/util/regex/Pattern;

    .line 67
    .line 68
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lk8/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 74
    .line 75
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lk8/g;->q:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 80
    .line 81
    new-instance v0, Lc9/q;

    .line 82
    .line 83
    const/16 v2, 0x11

    .line 84
    .line 85
    invoke-direct {v0, v2}, Lc9/q;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    sput-object v0, Lk8/g;->r:Ljava/util/concurrent/ExecutorService;

    .line 93
    .line 94
    new-instance v0, Lc9/q;

    .line 95
    .line 96
    const/16 v1, 0x12

    .line 97
    .line 98
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sput-object v0, Lk8/g;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 106
    .line 107
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 110
    .line 111
    .line 112
    sput-object v0, Lk8/g;->t:Ljava/util/concurrent/ConcurrentHashMap;

    .line 113
    .line 114
    return-void
.end method

.method public constructor <init>(Lh/Hchat/dexkit/DexFinder;Lm8/c;Lg8/a;Lg8/i;Lk8/s;Lf8/c;Li8/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 5
    .line 6
    iput-object p2, p0, Lk8/g;->b:Lm8/c;

    .line 7
    .line 8
    iput-object p3, p0, Lk8/g;->c:Lg8/a;

    .line 9
    .line 10
    iput-object p4, p0, Lk8/g;->d:Lg8/i;

    .line 11
    .line 12
    iput-object p5, p0, Lk8/g;->e:Lk8/s;

    .line 13
    .line 14
    iput-object p6, p0, Lk8/g;->f:Lf8/c;

    .line 15
    .line 16
    return-void
.end method

.method public static A(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "<![CDATA["

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const-string v0, "]]>"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/16 v0, 0x9

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-static {v1, v0, p0}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static varargs B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V
    .locals 4

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_3

    .line 4
    .line 5
    aget-object v2, p2, v1

    .line 6
    .line 7
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-static {v3, v2}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-static {v2, p0, p1}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :catchall_0
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    :goto_2
    return-void
.end method

.method public static a(Ljava/util/ArrayList;)Ljava/util/HashMap;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "<![CDATA["

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-lez v4, :cond_0

    .line 40
    .line 41
    const/16 v4, 0x2c

    .line 42
    .line 43
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, "]]>"

    .line 58
    .line 59
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string v1, "atuserlist"

    .line 67
    .line 68
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    return-object v0
.end method

.method public static b()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "<deviceinfo><MANUFACTURER name=\""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v1}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "\"><MODEL name=\""

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "\"><VERSION_RELEASE name=\""

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v1}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, "\"><VERSION_INCREMENTAL name=\""

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    sget-object v1, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v1}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, "\"><DISPLAY name=\""

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    sget-object v1, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, "\"></DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>"

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p0, p1}, Lk8/g;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object p1, Lk8/g;->t:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lk8/f;

    .line 35
    .line 36
    iget-object v2, v2, Lk8/f;->a:Ljava/util/concurrent/ScheduledFuture;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-interface {v2, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_3
    :goto_0
    return-void
.end method

.method public static f(Ljava/lang/String;)[B
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/StrictMode;->getThreadPolicy()Landroid/os/StrictMode$ThreadPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    new-instance v2, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 7
    .line 8
    invoke-direct {v2, v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Ljava/net/URL;

    .line 23
    .line 24
    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 32
    .line 33
    const/16 v2, 0x1388

    .line 34
    .line 35
    :try_start_1
    invoke-virtual {p0, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 36
    .line 37
    .line 38
    const/16 v2, 0x1f40

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 45
    .line 46
    .line 47
    const-string v2, "User-Agent"

    .line 48
    .line 49
    const-string v3, "MicroMessenger Client"

    .line 50
    .line 51
    invoke-virtual {p0, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/16 v3, 0xc8

    .line 59
    .line 60
    if-lt v2, v3, :cond_4

    .line 61
    .line 62
    const/16 v3, 0x12c

    .line 63
    .line 64
    if-lt v2, v3, :cond_0

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_0
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 68
    .line 69
    .line 70
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 71
    :try_start_2
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 74
    .line 75
    .line 76
    const/16 v4, 0x2000

    .line 77
    .line 78
    new-array v4, v4, [B

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    move v6, v5

    .line 82
    :goto_0
    invoke-virtual {v2, v4}, Ljava/io/InputStream;->read([B)I

    .line 83
    .line 84
    .line 85
    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 86
    const/4 v8, -0x1

    .line 87
    if-eq v7, v8, :cond_3

    .line 88
    .line 89
    add-int/2addr v6, v7

    .line 90
    const/high16 v8, 0x80000

    .line 91
    .line 92
    if-le v6, v8, :cond_2

    .line 93
    .line 94
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 95
    .line 96
    .line 97
    :catchall_0
    :goto_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 98
    .line 99
    .line 100
    :cond_1
    :try_start_4
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_2
    :try_start_5
    invoke-virtual {v3, v4, v5, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 109
    .line 110
    .line 111
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 112
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 113
    .line 114
    .line 115
    :catchall_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 116
    .line 117
    .line 118
    :try_start_7
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 119
    .line 120
    .line 121
    :catchall_2
    return-object v1

    .line 122
    :catchall_3
    move-object v2, v1

    .line 123
    goto :goto_3

    .line 124
    :cond_4
    :goto_2
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 125
    .line 126
    .line 127
    :try_start_8
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 128
    .line 129
    .line 130
    :catchall_4
    return-object v1

    .line 131
    :catchall_5
    move-object p0, v1

    .line 132
    move-object v2, p0

    .line 133
    :catchall_6
    :goto_3
    if-eqz v2, :cond_5

    .line 134
    .line 135
    :try_start_9
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 136
    .line 137
    .line 138
    :catchall_7
    :cond_5
    if-eqz p0, :cond_1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :catchall_8
    :goto_4
    return-object v1
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string v0, "&"

    .line 7
    .line 8
    const-string v1, "&amp;"

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "<"

    .line 15
    .line 16
    const-string v1, "&lt;"

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, ">"

    .line 23
    .line 24
    const-string v1, "&gt;"

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v0, "\""

    .line 31
    .line 32
    const-string v1, "&quot;"

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v0, "\'"

    .line 39
    .line 40
    const-string v1, "&apos;"

    .line 41
    .line 42
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    :try_start_0
    sget-object v0, Lk8/g;->k:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x0

    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    if-gtz v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "<refermsg"

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-gez v2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const-string v4, "</refermsg>"

    .line 60
    .line 61
    invoke-virtual {v1, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-ge v1, v2, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Lk8/g;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    return-object p0

    .line 81
    :catchall_0
    :cond_4
    :goto_2
    const-string p0, ""

    .line 82
    .line 83
    return-object p0
.end method

.method public static i(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)Ljava/lang/String;
    .locals 8

    .line 1
    if-eqz p0, :cond_c

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    if-eqz p4, :cond_2

    .line 8
    .line 9
    :try_start_0
    invoke-interface {p4, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_1
    invoke-interface {p4, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :catchall_0
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    const-class v2, Ljava/lang/String;

    .line 30
    .line 31
    const-class v3, Ljava/lang/Object;

    .line 32
    .line 33
    if-eqz v1, :cond_6

    .line 34
    .line 35
    if-eq v1, v3, :cond_6

    .line 36
    .line 37
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :catchall_1
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_5

    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/reflect/Field;

    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    if-eq v5, v2, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-static {v4, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    instance-of v5, v4, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    move-object v5, v4

    .line 73
    check-cast v5, Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_3

    .line 80
    .line 81
    check-cast v4, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    goto :goto_0

    .line 92
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    const/4 v4, 0x3

    .line 97
    const/4 v5, 0x1

    .line 98
    if-lt v1, v4, :cond_7

    .line 99
    .line 100
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_7

    .line 111
    .line 112
    const/4 v1, 0x2

    .line 113
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_7

    .line 124
    .line 125
    const/4 p0, 0x0

    .line 126
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Ljava/lang/String;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :goto_2
    if-eqz v0, :cond_c

    .line 138
    .line 139
    if-eq v0, v3, :cond_c

    .line 140
    .line 141
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :catchall_2
    :cond_8
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_b

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Ljava/lang/reflect/Field;

    .line 160
    .line 161
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    if-eqz v6, :cond_8

    .line 166
    .line 167
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-nez v7, :cond_8

    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/Class;->isEnum()Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-nez v7, :cond_8

    .line 178
    .line 179
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-eqz v7, :cond_9

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_9
    if-eq v6, v2, :cond_8

    .line 187
    .line 188
    const-class v7, Ljava/lang/Number;

    .line 189
    .line 190
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    if-nez v7, :cond_8

    .line 195
    .line 196
    const-class v7, Ljava/lang/Boolean;

    .line 197
    .line 198
    if-eq v6, v7, :cond_8

    .line 199
    .line 200
    const-class v7, Ljava/lang/Character;

    .line 201
    .line 202
    if-eq v6, v7, :cond_8

    .line 203
    .line 204
    const-class v7, Ljava/lang/Class;

    .line 205
    .line 206
    if-eq v6, v7, :cond_8

    .line 207
    .line 208
    const-class v7, Ljava/lang/reflect/Method;

    .line 209
    .line 210
    if-eq v6, v7, :cond_8

    .line 211
    .line 212
    const-class v7, Ljava/lang/reflect/Field;

    .line 213
    .line 214
    if-eq v6, v7, :cond_8

    .line 215
    .line 216
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    const-string v7, "java."

    .line 221
    .line 222
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-eqz v6, :cond_a

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_a
    invoke-static {v4, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    add-int/lit8 v6, p3, -0x1

    .line 234
    .line 235
    invoke-static {v4, p1, p2, v6, p4}, Lk8/g;->i(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 240
    .line 241
    .line 242
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 243
    if-nez v6, :cond_8

    .line 244
    .line 245
    return-object v4

    .line 246
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    goto :goto_2

    .line 251
    :cond_c
    :goto_4
    const-string p0, ""

    .line 252
    .line 253
    return-object p0
.end method

.method public static j(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->groupCount()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object p0, v0

    .line 32
    :goto_0
    invoke-static {p0}, Lk8/g;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    return-object p0

    .line 37
    :catchall_0
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static n(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eq v1, p0, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    array-length p1, p0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-ne p1, v1, :cond_3

    .line 28
    .line 29
    aget-object p0, p0, v0

    .line 30
    .line 31
    const-class p1, Ljava/lang/String;

    .line 32
    .line 33
    if-ne p0, p1, :cond_3

    .line 34
    .line 35
    return v1

    .line 36
    :cond_3
    :goto_0
    return v0
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 p0, 0xa

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    :goto_0
    const-string p0, ""

    .line 44
    .line 45
    return-object p0
.end method

.method public static r(Ljava/lang/Object;)J
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    const-string v0, "getMsgID"

    .line 5
    .line 6
    const-string v1, "getId"

    .line 7
    .line 8
    const-string v2, "getMsgId"

    .line 9
    .line 10
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    const/4 v3, 0x3

    .line 17
    if-ge v2, v3, :cond_2

    .line 18
    .line 19
    aget-object v3, v0, v2

    .line 20
    .line 21
    new-array v4, v1, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p0, v3, v4}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    instance-of v4, v3, Ljava/lang/Number;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    check-cast v3, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0

    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const-string v0, "msgID"

    .line 42
    .line 43
    const-string v2, "id"

    .line 44
    .line 45
    const-string v3, "field_msgId"

    .line 46
    .line 47
    const-string v4, "msgId"

    .line 48
    .line 49
    filled-new-array {v3, v4, v0, v2}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_1
    const/4 v2, 0x4

    .line 54
    if-ge v1, v2, :cond_4

    .line 55
    .line 56
    aget-object v2, v0, v1

    .line 57
    .line 58
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    instance-of v3, v2, Ljava/lang/Number;

    .line 63
    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    check-cast v2, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0

    .line 73
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    :goto_2
    const-wide/16 v0, 0x0

    .line 77
    .line 78
    return-wide v0
.end method

.method public static t(Ljava/lang/String;Ljava/lang/String;Lf8/c;Lf8/g;)V
    .locals 6

    .line 1
    invoke-static {p0, p1}, Lk8/g;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v2, Lk8/f;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lk8/g;->t:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    new-instance p1, Lcom/alibaba/fastjson2/writer/b;

    .line 20
    .line 21
    const/16 v0, 0x19

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    sget-object p0, Lk8/g;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 36
    .line 37
    new-instance v0, Lb9/c;

    .line 38
    .line 39
    const/16 v5, 0xa

    .line 40
    .line 41
    move-object v3, p2

    .line 42
    move-object v4, p3

    .line 43
    invoke-direct/range {v0 .. v5}, Lb9/c;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    const-wide/16 p1, 0x9c4

    .line 47
    .line 48
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 49
    .line 50
    invoke-interface {p0, v0, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iput-object p0, v2, Lk8/f;->a:Ljava/util/concurrent/ScheduledFuture;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/Object;
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    array-length v1, p1

    .line 12
    new-array v1, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aput-object p2, v1, v2

    .line 16
    .line 17
    sget-object p2, Lk8/g;->h:Ljava/util/regex/Pattern;

    .line 18
    .line 19
    invoke-static {p2, p4}, Lk8/g;->j(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object p2, Lk8/g;->i:Ljava/util/regex/Pattern;

    .line 31
    .line 32
    invoke-static {p2, p4}, Lk8/g;->j(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :goto_0
    const/4 v3, 0x1

    .line 37
    aput-object p2, v1, v3

    .line 38
    .line 39
    sget-object p2, Lk8/g;->j:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    invoke-static {p2, p4}, Lk8/g;->j(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const/4 v3, 0x2

    .line 46
    aput-object p2, v1, v3

    .line 47
    .line 48
    const/4 p2, 0x3

    .line 49
    aput-object p3, v1, p2

    .line 50
    .line 51
    const/4 p2, 0x4

    .line 52
    const-string v3, ""

    .line 53
    .line 54
    aput-object v3, v1, p2

    .line 55
    .line 56
    sget-object v4, Lk8/g;->l:Ljava/util/regex/Pattern;

    .line 57
    .line 58
    invoke-static {v4, p4}, Lk8/g;->j(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    sget-object v5, Lk8/g;->m:Ljava/util/regex/Pattern;

    .line 63
    .line 64
    invoke-static {v5, p4}, Lk8/g;->j(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    sget-object v6, Lk8/g;->n:Ljava/util/regex/Pattern;

    .line 69
    .line 70
    invoke-static {v6, p4}, Lk8/g;->j(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    sget-object v7, Lk8/g;->o:Ljava/util/regex/Pattern;

    .line 75
    .line 76
    invoke-static {v7, p4}, Lk8/g;->j(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    filled-new-array {v4, v5, v6, p4}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    move v4, v2

    .line 85
    :goto_1
    const/4 v5, 0x0

    .line 86
    if-ge v4, p2, :cond_5

    .line 87
    .line 88
    aget-object v6, p4, v4

    .line 89
    .line 90
    if-nez v6, :cond_1

    .line 91
    .line 92
    move-object v6, v3

    .line 93
    goto :goto_2

    .line 94
    :cond_1
    invoke-static {v6}, Lk8/g;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    const-string v7, "&amp;"

    .line 99
    .line 100
    const-string v8, "&"

    .line 101
    .line 102
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    const-string v7, "&lt;"

    .line 107
    .line 108
    const-string v8, "<"

    .line 109
    .line 110
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    const-string v7, "&gt;"

    .line 115
    .line 116
    const-string v8, ">"

    .line 117
    .line 118
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    const-string v7, "&quot;"

    .line 123
    .line 124
    const-string v8, "\""

    .line 125
    .line 126
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    const-string v7, "&apos;"

    .line 131
    .line 132
    const-string v8, "\'"

    .line 133
    .line 134
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    :goto_2
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_2

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_2
    sget-object v7, Lk8/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 150
    .line 151
    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, [B

    .line 156
    .line 157
    if-eqz v7, :cond_3

    .line 158
    .line 159
    array-length v8, v7

    .line 160
    if-lez v8, :cond_3

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_3
    sget-object v5, Lk8/g;->q:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 164
    .line 165
    invoke-interface {v5, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-nez v5, :cond_4

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_4
    new-instance v5, Lfb/e1;

    .line 173
    .line 174
    invoke-direct {v5, p0, v6}, Lfb/e1;-><init>(Lk8/g;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    sget-object v6, Lk8/g;->r:Ljava/util/concurrent/ExecutorService;

    .line 178
    .line 179
    invoke-interface {v6, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 180
    .line 181
    .line 182
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_5
    move-object v7, v5

    .line 186
    :goto_4
    const/4 p2, 0x5

    .line 187
    aput-object v7, v1, p2

    .line 188
    .line 189
    new-instance p2, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string p4, "Hchat_xml_"

    .line 192
    .line 193
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 197
    .line 198
    .line 199
    move-result-wide v6

    .line 200
    invoke-virtual {p2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    const/4 p4, 0x6

    .line 208
    aput-object p2, v1, p4

    .line 209
    .line 210
    const/4 p2, 0x7

    .line 211
    aput-object v3, v1, p2

    .line 212
    .line 213
    if-eqz p5, :cond_6

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_6
    move-object p5, v3

    .line 217
    :goto_5
    const/16 p2, 0x8

    .line 218
    .line 219
    aput-object p5, v1, p2

    .line 220
    .line 221
    array-length p2, p1

    .line 222
    const/16 p4, 0xa

    .line 223
    .line 224
    const/16 p5, 0x9

    .line 225
    .line 226
    if-ne p2, p4, :cond_7

    .line 227
    .line 228
    aput-object v0, v1, p5

    .line 229
    .line 230
    return-object v1

    .line 231
    :cond_7
    array-length p2, p1

    .line 232
    const/16 v4, 0xc

    .line 233
    .line 234
    if-ne p2, v4, :cond_a

    .line 235
    .line 236
    aget-object p1, p1, p5

    .line 237
    .line 238
    :try_start_0
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 239
    .line 240
    const-class v4, Ljava/lang/String;

    .line 241
    .line 242
    filled-new-array {p2, v4}, [Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    invoke-static {p1, p2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    filled-new-array {v0, p3}, [Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p3

    .line 254
    invoke-static {p2, p3}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    if-eqz p2, :cond_8

    .line 259
    .line 260
    :goto_6
    move-object v5, p2

    .line 261
    goto :goto_7

    .line 262
    :catchall_0
    :cond_8
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->staticInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    if-eqz p2, :cond_9

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_9
    :try_start_1
    new-array p2, v2, [Ljava/lang/Class;

    .line 270
    .line 271
    invoke-static {p1, p2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    new-array p2, v2, [Ljava/lang/Object;

    .line 276
    .line 277
    invoke-static {p1, p2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 281
    :catchall_1
    :goto_7
    aput-object v5, v1, p5

    .line 282
    .line 283
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 284
    .line 285
    aput-object p1, v1, p4

    .line 286
    .line 287
    const/16 p1, 0xb

    .line 288
    .line 289
    aput-object v3, v1, p1

    .line 290
    .line 291
    :cond_a
    return-object v1
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;ILjava/io/Serializable;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lk8/g;->f:Lf8/c;

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_5

    .line 12
    .line 13
    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto :goto_6

    .line 20
    :cond_0
    :try_start_0
    new-instance v2, Lf8/g;

    .line 21
    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v4, "<appmsg"

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    const-string v4, "</appmsg>"

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    const/4 v3, 0x0

    .line 48
    :goto_1
    if-eqz v3, :cond_3

    .line 49
    .line 50
    move-object/from16 v3, p2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    const-string v3, ""

    .line 54
    .line 55
    :goto_2
    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    const-wide/16 v8, 0x3e8

    .line 64
    .line 65
    div-long v8, v4, v8

    .line 66
    .line 67
    if-eqz p4, :cond_4

    .line 68
    .line 69
    invoke-static/range {p4 .. p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    :goto_3
    move-object v12, v4

    .line 74
    goto :goto_4

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    goto :goto_5

    .line 77
    :cond_4
    const/4 v4, 0x0

    .line 78
    goto :goto_3

    .line 79
    :goto_4
    const-string v14, "local_send"

    .line 80
    .line 81
    const/4 v15, 0x1

    .line 82
    const-wide/16 v10, 0x0

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    move-object/from16 v5, p1

    .line 86
    .line 87
    move-object/from16 v4, p1

    .line 88
    .line 89
    move-object/from16 v6, p2

    .line 90
    .line 91
    invoke-direct/range {v2 .. v15}, Lf8/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    invoke-static {v4, v6, v0, v2}, Lk8/g;->t(Ljava/lang/String;Ljava/lang/String;Lf8/c;Lf8/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v3, "\u767b\u8bb0\u672c\u5730\u53d1\u9001\u515c\u5e95\u4e8b\u4ef6\u5931\u8d25: "

    .line 101
    .line 102
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v1, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    :goto_6
    return-void
.end method

.method public final k(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 5
    .line 6
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->serviceGetterMethod:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v1, v0, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    return-object p1

    .line 20
    :catchall_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lk8/g;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 6
    .line 7
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->netQueueClass:Ljava/lang/Class;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->netQueueCandidateClasses:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lk8/g;->b:Lm8/c;

    .line 21
    .line 22
    iget-object v1, p0, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 23
    .line 24
    iget-object v2, v1, Lh/Hchat/dexkit/DexFinder;->netQueueClass:Ljava/lang/Class;

    .line 25
    .line 26
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->netQueueCandidateClasses:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lm8/c;->c(Ljava/lang/Class;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Lk8/g;->g:Z

    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method

.method public final m()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->sendTextMsgClass:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->sendTextMsgCtorLong:Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->sendTextMsgCtorObject:Ljava/lang/reflect/Constructor;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final o(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[WeChatMessageApi] "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 8
    .line 9
    if-eqz p5, :cond_0

    .line 10
    .line 11
    iget-object v2, v1, Lh/Hchat/dexkit/DexFinder;->sendTextMsgCtorObject:Ljava/lang/reflect/Constructor;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    filled-new-array {p1, p2, p3, p4, p5}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    iget-object v2, v1, Lh/Hchat/dexkit/DexFinder;->sendTextMsgCtorLong:Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p4

    .line 44
    filled-new-array {p1, p2, p3, p4, v0}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_1
    iget-object v2, v1, Lh/Hchat/dexkit/DexFinder;->sendTextMsgCtorObject:Ljava/lang/reflect/Constructor;

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    filled-new-array {p1, p2, p3, p4, p5}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_2
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->sendTextMsgClass:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    if-eqz p5, :cond_3

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    move-object p5, v0

    .line 88
    :goto_0
    filled-new-array {p1, p2, p3, p4, p5}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const/4 p2, 0x0

    .line 93
    if-nez v1, :cond_4

    .line 94
    .line 95
    return-object p2

    .line 96
    :cond_4
    :try_start_0
    invoke-static {v1, p1}, Lh/Hchat/utils/KavaReflector;->newInstanceByArgs(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    return-object p1

    .line 101
    :catchall_0
    return-object p2
.end method

.method public final s(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lk8/g;->b:Lm8/c;

    .line 2
    .line 3
    const-string v1, "\u64a4\u56de\u539f\u751f\u6d88\u606f"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const-string p1, "\u64a4\u56de\u6d88\u606f\u5931\u8d25: \u539f\u751f\u6d88\u606f\u5bf9\u8c61\u4e3a\u7a7a"

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    iget-object v3, p0, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 15
    .line 16
    iget-object v4, v3, Lh/Hchat/dexkit/DexFinder;->revokeMsgCtor:Ljava/lang/reflect/Constructor;

    .line 17
    .line 18
    if-eqz v4, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0}, Lk8/g;->l()V

    .line 21
    .line 22
    .line 23
    :try_start_0
    iget-object v3, v3, Lh/Hchat/dexkit/DexFinder;->revokeMsgCtor:Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    const-string v4, "\u4f60\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    .line 26
    .line 27
    const-string v5, ""

    .line 28
    .line 29
    filled-new-array {p1, v4, v5}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v3, v4}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    const-string p1, "\u64a4\u56de\u6d88\u606f\u5931\u8d25: NetSceneRevokeMsg\u6784\u9020\u5931\u8d25"

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v2

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v0, v3}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    const-string v1, "\u5df2\u53d1\u9001"

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const-string v1, "\u53d1\u9001\u5931\u8d25"

    .line 62
    .line 63
    :goto_0
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ": msgId="

    .line 67
    .line 68
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lk8/g;->r(Ljava/lang/Object;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    return v0

    .line 86
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v1, "\u64a4\u56de\u6d88\u606f\u5f02\u5e38: "

    .line 89
    .line 90
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return v2

    .line 108
    :cond_3
    const-string p1, "\u64a4\u56de\u6d88\u606f\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return v2
.end method

.method public final u(JLjava/lang/String;Ljava/lang/String;)Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    const-string v1, "\u53d1\u9001\u5f15\u7528\u5931\u8d25: talker\u4e3a\u7a7a"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return v5

    .line 20
    :cond_0
    const-wide/16 v6, 0x0

    .line 21
    .line 22
    cmp-long v4, v1, v6

    .line 23
    .line 24
    if-gtz v4, :cond_1

    .line 25
    .line 26
    const-string v1, "\u53d1\u9001\u5f15\u7528\u5931\u8d25: msgId\u65e0\u6548"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return v5

    .line 32
    :cond_1
    iget-object v4, v0, Lk8/g;->e:Lk8/s;

    .line 33
    .line 34
    invoke-virtual {v4}, Lk8/s;->h()Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    if-nez v8, :cond_2

    .line 39
    .line 40
    const-string v1, "\u53d1\u9001\u5f15\u7528\u5931\u8d25: messageStore\u672a\u5c31\u7eea"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return v5

    .line 46
    :cond_2
    invoke-virtual {v4, v1, v2}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    if-nez v8, :cond_3

    .line 51
    .line 52
    invoke-virtual {v4, v1, v2}, Lk8/s;->d(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    :cond_3
    if-nez v8, :cond_4

    .line 57
    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v4, "\u53d1\u9001\u5f15\u7528\u5931\u8d25: \u672a\u627e\u5230\u6e90\u6d88\u606f msgId/msgSvrId="

    .line 61
    .line 62
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return v5

    .line 76
    :cond_4
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-nez v9, :cond_5

    .line 81
    .line 82
    move-object/from16 v9, p4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    if-eqz v9, :cond_6

    .line 90
    .line 91
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    if-eqz v9, :cond_6

    .line 96
    .line 97
    invoke-virtual {v9}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getTitle()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    if-nez v10, :cond_6

    .line 106
    .line 107
    invoke-virtual {v9}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getTitle()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    goto :goto_0

    .line 112
    :cond_6
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    :goto_0
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getTalker()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    const-string v11, ""

    .line 125
    .line 126
    if-nez v10, :cond_7

    .line 127
    .line 128
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getTalker()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    goto :goto_1

    .line 133
    :cond_7
    if-eqz v3, :cond_8

    .line 134
    .line 135
    move-object v10, v3

    .line 136
    goto :goto_1

    .line 137
    :cond_8
    move-object v10, v11

    .line 138
    :goto_1
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-eqz v12, :cond_9

    .line 143
    .line 144
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    if-eqz v12, :cond_9

    .line 149
    .line 150
    invoke-virtual {v12}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getSendTalker()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-nez v13, :cond_9

    .line 159
    .line 160
    invoke-virtual {v12}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getSendTalker()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    goto :goto_2

    .line 165
    :cond_9
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getSendTalker()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v12

    .line 169
    :goto_2
    iget-object v13, v0, Lk8/g;->c:Lg8/a;

    .line 170
    .line 171
    invoke-virtual {v13}, Lg8/a;->c()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v14

    .line 175
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v14

    .line 179
    if-nez v14, :cond_a

    .line 180
    .line 181
    invoke-virtual {v13}, Lg8/a;->c()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    goto :goto_3

    .line 186
    :cond_a
    if-eqz v3, :cond_c

    .line 187
    .line 188
    invoke-static {v3}, Lg8/i;->I(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    if-eqz v13, :cond_c

    .line 193
    .line 194
    :cond_b
    move-object v4, v11

    .line 195
    goto :goto_3

    .line 196
    :cond_c
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    if-nez v13, :cond_d

    .line 201
    .line 202
    move-object v4, v3

    .line 203
    goto :goto_3

    .line 204
    :cond_d
    invoke-virtual {v4, v3}, Lk8/s;->b(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    if-eqz v4, :cond_b

    .line 209
    .line 210
    iget-object v13, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->selfWxId:Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    if-nez v13, :cond_b

    .line 217
    .line 218
    iget-object v4, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->selfWxId:Ljava/lang/String;

    .line 219
    .line 220
    :goto_3
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    if-eqz v13, :cond_e

    .line 225
    .line 226
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 227
    .line 228
    .line 229
    move-result-object v13

    .line 230
    if-eqz v13, :cond_e

    .line 231
    .line 232
    invoke-virtual {v13}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getDisplayName()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v14

    .line 236
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 237
    .line 238
    .line 239
    move-result v14

    .line 240
    if-nez v14, :cond_e

    .line 241
    .line 242
    invoke-virtual {v13}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getDisplayName()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    goto :goto_5

    .line 247
    :cond_e
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getSendTalker()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v13

    .line 251
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result v14

    .line 255
    if-eqz v14, :cond_f

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_f
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    iget-object v14, v0, Lk8/g;->d:Lg8/i;

    .line 263
    .line 264
    if-eqz v11, :cond_10

    .line 265
    .line 266
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getTalker()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v11

    .line 270
    invoke-virtual {v14, v11, v13}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    goto :goto_4

    .line 275
    :cond_10
    invoke-virtual {v14, v13}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v11

    .line 279
    :goto_4
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v14

    .line 283
    if-nez v14, :cond_11

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_11
    move-object v11, v13

    .line 287
    :goto_5
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 288
    .line 289
    .line 290
    move-result v13

    .line 291
    if-eqz v13, :cond_12

    .line 292
    .line 293
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 294
    .line 295
    .line 296
    move-result-object v13

    .line 297
    if-eqz v13, :cond_12

    .line 298
    .line 299
    invoke-virtual {v13}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getMsgSource()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v14

    .line 303
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    if-nez v14, :cond_12

    .line 308
    .line 309
    invoke-virtual {v13}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getMsgSource()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v13

    .line 313
    goto :goto_6

    .line 314
    :cond_12
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgSource()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v13

    .line 318
    :goto_6
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 319
    .line 320
    .line 321
    move-result v14

    .line 322
    if-eqz v14, :cond_13

    .line 323
    .line 324
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 325
    .line 326
    .line 327
    move-result-object v14

    .line 328
    if-eqz v14, :cond_13

    .line 329
    .line 330
    invoke-virtual {v14}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getContent()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v15

    .line 334
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 335
    .line 336
    .line 337
    move-result v15

    .line 338
    if-nez v15, :cond_13

    .line 339
    .line 340
    invoke-virtual {v14}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getContent()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    goto :goto_7

    .line 345
    :cond_13
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v14

    .line 349
    :goto_7
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 350
    .line 351
    .line 352
    move-result v15

    .line 353
    if-eqz v15, :cond_14

    .line 354
    .line 355
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 356
    .line 357
    .line 358
    move-result-object v15

    .line 359
    if-eqz v15, :cond_14

    .line 360
    .line 361
    invoke-virtual {v15}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getSvrId()J

    .line 362
    .line 363
    .line 364
    move-result-wide v16

    .line 365
    cmp-long v16, v16, v6

    .line 366
    .line 367
    if-lez v16, :cond_14

    .line 368
    .line 369
    invoke-virtual {v15}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getSvrId()J

    .line 370
    .line 371
    .line 372
    move-result-wide v15

    .line 373
    move-wide/from16 v20, v15

    .line 374
    .line 375
    move v15, v5

    .line 376
    move-wide/from16 v16, v6

    .line 377
    .line 378
    move-wide/from16 v5, v20

    .line 379
    .line 380
    goto :goto_8

    .line 381
    :cond_14
    move v15, v5

    .line 382
    move-wide/from16 v16, v6

    .line 383
    .line 384
    iget-wide v5, v8, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 385
    .line 386
    :goto_8
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    if-eqz v7, :cond_16

    .line 391
    .line 392
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    if-eqz v7, :cond_16

    .line 397
    .line 398
    invoke-virtual {v7}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getCreateTime()J

    .line 399
    .line 400
    .line 401
    move-result-wide v18

    .line 402
    cmp-long v16, v18, v16

    .line 403
    .line 404
    if-lez v16, :cond_16

    .line 405
    .line 406
    invoke-virtual {v7}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getCreateTime()J

    .line 407
    .line 408
    .line 409
    move-result-wide v16

    .line 410
    :cond_15
    :goto_9
    move-object/from16 v18, v8

    .line 411
    .line 412
    move-wide/from16 v7, v16

    .line 413
    .line 414
    goto :goto_a

    .line 415
    :cond_16
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatMessage;->getCreateTime()J

    .line 416
    .line 417
    .line 418
    move-result-wide v16

    .line 419
    const-wide v18, 0xe8d4a51000L

    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    cmp-long v7, v16, v18

    .line 425
    .line 426
    if-lez v7, :cond_15

    .line 427
    .line 428
    const-wide/16 v18, 0x3e8

    .line 429
    .line 430
    div-long v16, v16, v18

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :goto_a
    invoke-virtual/range {v18 .. v18}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 434
    .line 435
    .line 436
    move-result v16

    .line 437
    if-eqz v16, :cond_17

    .line 438
    .line 439
    invoke-virtual/range {v18 .. v18}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 440
    .line 441
    .line 442
    move-result-object v16

    .line 443
    if-eqz v16, :cond_17

    .line 444
    .line 445
    invoke-virtual/range {v16 .. v16}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getType()I

    .line 446
    .line 447
    .line 448
    move-result v17

    .line 449
    if-lez v17, :cond_17

    .line 450
    .line 451
    invoke-virtual/range {v16 .. v16}, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->getType()I

    .line 452
    .line 453
    .line 454
    move-result v16

    .line 455
    :goto_b
    move/from16 p4, v15

    .line 456
    .line 457
    move/from16 v15, v16

    .line 458
    .line 459
    goto :goto_c

    .line 460
    :cond_17
    invoke-virtual/range {v18 .. v18}, Lh/Hchat/hooks/api/model/WeChatMessage;->getType()I

    .line 461
    .line 462
    .line 463
    move-result v16

    .line 464
    goto :goto_b

    .line 465
    :goto_c
    invoke-static {v13}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v13

    .line 469
    invoke-static {v14}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v14

    .line 473
    move-object/from16 v16, v4

    .line 474
    .line 475
    new-instance v4, Ljava/lang/StringBuilder;

    .line 476
    .line 477
    move-object/from16 v17, v9

    .line 478
    .line 479
    const-string v9, "<?xml version=\"1.0\"?><msg><appmsg appid=\"\" sdkver=\"0\"><title>"

    .line 480
    .line 481
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    invoke-static/range {v17 .. v17}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v9

    .line 488
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    const-string v9, "</title><type>57</type><appattach><cdnthumbaeskey /><aeskey /></appattach><refermsg><type>"

    .line 492
    .line 493
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    const-string v9, "</type><svrid>"

    .line 500
    .line 501
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    const-string v5, "</svrid><fromusr>"

    .line 508
    .line 509
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-static {v10}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    const-string v5, "</fromusr><chatusr>"

    .line 520
    .line 521
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-static {v12}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    const-string v5, "</chatusr><displayname>"

    .line 532
    .line 533
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-static {v11}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    const-string v5, "</displayname><msgsource>"

    .line 544
    .line 545
    const-string v6, "</msgsource><content>"

    .line 546
    .line 547
    invoke-static {v4, v5, v13, v6, v14}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    const-string v5, "</content><createtime>"

    .line 551
    .line 552
    const-string v6, "</createtime></refermsg></appmsg><fromusername>"

    .line 553
    .line 554
    invoke-static {v4, v5, v7, v8, v6}, Lj8/b;->s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-static/range {v16 .. v16}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    const-string v5, "</fromusername><scene>0</scene><appinfo><version>1</version><appname></appname></appinfo><commenturl></commenturl></msg>"

    .line 565
    .line 566
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 574
    .line 575
    .line 576
    move-result v5

    .line 577
    if-eqz v5, :cond_18

    .line 578
    .line 579
    new-instance v3, Ljava/lang/StringBuilder;

    .line 580
    .line 581
    const-string v4, "\u53d1\u9001\u5f15\u7528\u5931\u8d25: \u6784\u9020\u5f15\u7528XML\u5931\u8d25 msgId="

    .line 582
    .line 583
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    invoke-virtual {v0, v1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    return p4

    .line 597
    :cond_18
    invoke-virtual {v0, v3, v4}, Lk8/g;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 598
    .line 599
    .line 600
    move-result v1

    .line 601
    return v1
.end method

.method public final v(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 1
    const-string v0, "\u53d1\u9001\u539f\u59cb\u6d88\u606f"

    .line 2
    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    :cond_0
    move-object v3, p0

    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_1
    if-gtz p1, :cond_2

    .line 20
    .line 21
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string p3, "\u53d1\u9001\u539f\u59cb\u6d88\u606f\u5931\u8d25: messageType \u65e0\u6548 "

    .line 24
    .line 25
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return v2

    .line 39
    :cond_2
    invoke-virtual {p0}, Lk8/g;->m()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    const-string p1, "\u53d1\u9001\u539f\u59cb\u6d88\u606f\u5931\u8d25: API \u672a\u5c31\u7eea"

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return v2

    .line 51
    :cond_3
    invoke-virtual {p0}, Lk8/g;->l()V

    .line 52
    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    move-object v3, p0

    .line 57
    move v6, p1

    .line 58
    move-object v4, p2

    .line 59
    move-object v5, p3

    .line 60
    :try_start_0
    invoke-virtual/range {v3 .. v8}, Lk8/g;->p(Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object p2, v3, Lk8/g;->b:Lm8/c;

    .line 65
    .line 66
    invoke-virtual {p2, p1}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    const/4 p2, 0x0

    .line 73
    invoke-virtual {p0, v4, v5, v6, p2}, Lk8/g;->e(Ljava/lang/String;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    move-object p1, v0

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    const-string p3, "\u6210\u529f"

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    const-string p3, "\u5931\u8d25"

    .line 91
    .line 92
    :goto_1
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p3, ": "

    .line 96
    .line 97
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p3, " type="

    .line 104
    .line 105
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p0, p2}, Lk8/g;->o(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    return p1

    .line 119
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string p3, "\u53d1\u9001\u539f\u59cb\u6d88\u606f\u5f02\u5e38: "

    .line 122
    .line 123
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return v2

    .line 141
    :goto_3
    const-string p1, "\u53d1\u9001\u539f\u59cb\u6d88\u606f\u5931\u8d25: talker/content \u4e3a\u7a7a"

    .line 142
    .line 143
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return v2
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 12

    .line 1
    const-string v1, "\u53d1\u9001\u540d\u7247"

    .line 2
    .line 3
    const-string v2, "\u53d1\u9001\u540d\u7247\u5931\u8d25: \u6784\u9020\u540d\u7247XML\u5931\u8d25 "

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    :cond_0
    move-object v6, p0

    .line 19
    goto/16 :goto_9

    .line 20
    .line 21
    :cond_1
    invoke-virtual {p0}, Lk8/g;->m()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    const-string p1, "\u53d1\u9001\u540d\u7247\u5931\u8d25: \u53d1\u9001API\u672a\u5c31\u7eea"

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return v3

    .line 33
    :cond_2
    iget-object v0, p0, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 34
    .line 35
    iget-object v4, v0, Lh/Hchat/dexkit/DexFinder;->contactCardXmlMethod:Ljava/lang/reflect/Method;

    .line 36
    .line 37
    if-nez v4, :cond_3

    .line 38
    .line 39
    const-string p1, "\u53d1\u9001\u540d\u7247\u5931\u8d25: \u540d\u7247API\u672a\u5c31\u7eea"

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v3

    .line 45
    :cond_3
    invoke-virtual {p0}, Lk8/g;->l()V

    .line 46
    .line 47
    .line 48
    :try_start_0
    const-string v4, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    :try_start_1
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->contactCardXmlMethod:Ljava/lang/reflect/Method;

    .line 52
    .line 53
    filled-new-array {p2, v5}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-static {v0, v5, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    instance-of v6, v0, Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v6, :cond_4

    .line 64
    .line 65
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    move-object v8, v0

    .line 68
    goto :goto_2

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    :goto_0
    move-object v8, v4

    .line 72
    goto :goto_2

    .line 73
    :goto_1
    :try_start_2
    new-instance v6, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v7, "\u6784\u9020\u540d\u7247XML\u5f02\u5e38: "

    .line 76
    .line 77
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p0, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :goto_2
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    :try_start_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 114
    .line 115
    .line 116
    return v3

    .line 117
    :catchall_1
    move-exception v0

    .line 118
    move-object p1, v0

    .line 119
    move-object v6, p0

    .line 120
    goto :goto_8

    .line 121
    :cond_5
    :try_start_4
    const-string v0, "openimappid="

    .line 122
    .line 123
    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 127
    if-eqz v0, :cond_6

    .line 128
    .line 129
    const/16 v0, 0x42

    .line 130
    .line 131
    :goto_3
    move v9, v0

    .line 132
    goto :goto_4

    .line 133
    :cond_6
    const/16 v0, 0x2a

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :goto_4
    const/4 v10, 0x0

    .line 137
    const/4 v11, 0x0

    .line 138
    move-object v6, p0

    .line 139
    move-object v7, p1

    .line 140
    :try_start_5
    invoke-virtual/range {v6 .. v11}, Lk8/g;->p(Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iget-object v0, v6, Lk8/g;->b:Lm8/c;

    .line 145
    .line 146
    invoke-virtual {v0, p1}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_7

    .line 151
    .line 152
    invoke-virtual {p0, v7, v8, v9, v5}, Lk8/g;->e(Ljava/lang/String;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 153
    .line 154
    .line 155
    goto :goto_6

    .line 156
    :catchall_2
    move-exception v0

    .line 157
    :goto_5
    move-object p1, v0

    .line 158
    goto :goto_8

    .line 159
    :cond_7
    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    if-eqz p1, :cond_8

    .line 165
    .line 166
    const-string v1, "\u6210\u529f"

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_8
    const-string v1, "\u5931\u8d25"

    .line 170
    .line 171
    :goto_7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v1, ": "

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v1, " wxid="

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-virtual {p0, p2}, Lk8/g;->o(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 195
    .line 196
    .line 197
    return p1

    .line 198
    :catchall_3
    move-exception v0

    .line 199
    move-object v6, p0

    .line 200
    goto :goto_5

    .line 201
    :goto_8
    new-instance p2, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    const-string v0, "\u53d1\u9001\u540d\u7247\u5f02\u5e38: "

    .line 204
    .line 205
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return v3

    .line 223
    :goto_9
    const-string p1, "\u53d1\u9001\u540d\u7247\u5931\u8d25: talker/wxid \u4e3a\u7a7a"

    .line 224
    .line 225
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return v3
.end method

.method public final x(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 1
    const-string v0, "\u53d1\u9001\u6587\u672c"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    :cond_0
    move-object v3, p0

    .line 17
    goto :goto_3

    .line 18
    :cond_1
    invoke-virtual {p0}, Lk8/g;->m()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    const-string p1, "\u53d1\u9001\u6587\u672c\u5931\u8d25: API \u672a\u5c31\u7eea"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    invoke-virtual {p0}, Lk8/g;->l()V

    .line 31
    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v6, 0x1

    .line 36
    move-object v3, p0

    .line 37
    move-object v4, p1

    .line 38
    move-object v5, p2

    .line 39
    :try_start_0
    invoke-virtual/range {v3 .. v8}, Lk8/g;->p(Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object p2, v3, Lk8/g;->b:Lm8/c;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const/4 p2, 0x1

    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {p0, v4, v5, p2, v1}, Lk8/g;->e(Ljava/lang/String;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    move-object p1, v0

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    const-string v0, "\u6210\u529f"

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    const-string v0, "\u5931\u8d25"

    .line 71
    .line 72
    :goto_1
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, ": "

    .line 76
    .line 77
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p0, p2}, Lk8/g;->o(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    return p1

    .line 91
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v0, "\u53d1\u9001\u6587\u672c\u5f02\u5e38: "

    .line 94
    .line 95
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return v2

    .line 113
    :goto_3
    const-string p1, "\u53d1\u9001\u6587\u672c\u5931\u8d25: talker/text \u4e3a\u7a7a"

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return v2
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z
    .locals 8

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    :cond_0
    move-object v2, p0

    .line 15
    goto/16 :goto_5

    .line 16
    .line 17
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_4

    .line 31
    .line 32
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    if-eqz p3, :cond_5

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1

    .line 66
    :cond_5
    invoke-virtual {p0}, Lk8/g;->m()Z

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    if-eqz p3, :cond_8

    .line 71
    .line 72
    iget-object p3, p0, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 73
    .line 74
    iget-object p3, p3, Lh/Hchat/dexkit/DexFinder;->sendTextMsgCtorObject:Ljava/lang/reflect/Constructor;

    .line 75
    .line 76
    if-eqz p3, :cond_8

    .line 77
    .line 78
    invoke-virtual {p0}, Lk8/g;->l()V

    .line 79
    .line 80
    .line 81
    :try_start_0
    invoke-static {v0}, Lk8/g;->a(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 82
    .line 83
    .line 84
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 85
    const/4 v5, 0x1

    .line 86
    const/4 v6, 0x1

    .line 87
    move-object v2, p0

    .line 88
    move-object v3, p1

    .line 89
    move-object v4, p2

    .line 90
    :try_start_1
    invoke-virtual/range {v2 .. v7}, Lk8/g;->p(Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-object p2, v2, Lk8/g;->b:Lm8/c;

    .line 95
    .line 96
    invoke-virtual {p2, p1}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_6

    .line 101
    .line 102
    invoke-static {v0}, Lk8/g;->a(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    const/4 p3, 0x1

    .line 107
    invoke-virtual {p0, v3, v4, p3, p2}, Lk8/g;->e(Ljava/lang/String;Ljava/lang/String;ILjava/io/Serializable;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    :goto_1
    move-object p1, v0

    .line 113
    goto :goto_4

    .line 114
    :cond_6
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string p3, "\u53d1\u9001@\u6587\u672c"

    .line 120
    .line 121
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    if-eqz p1, :cond_7

    .line 125
    .line 126
    const-string p3, "\u6210\u529f"

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_7
    const-string p3, "\u5931\u8d25"

    .line 130
    .line 131
    :goto_3
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string p3, ": "

    .line 135
    .line 136
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p0, p2}, Lk8/g;->o(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    .line 148
    .line 149
    return p1

    .line 150
    :catchall_1
    move-exception v0

    .line 151
    move-object v2, p0

    .line 152
    goto :goto_1

    .line 153
    :goto_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string p3, "\u53d1\u9001@\u6587\u672c\u5f02\u5e38: "

    .line 156
    .line 157
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return v1

    .line 175
    :cond_8
    move-object v2, p0

    .line 176
    const-string p1, "\u53d1\u9001@\u6587\u672c\u5931\u8d25: Object\u6784\u9020\u5668\u4e0d\u53ef\u7528"

    .line 177
    .line 178
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return v1

    .line 182
    :goto_5
    const-string p1, "\u53d1\u9001@\u6587\u672c\u5931\u8d25: talker/text \u4e3a\u7a7a"

    .line 183
    .line 184
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return v1
.end method

.method public final z(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 12

    .line 1
    const-string v0, "</appmsg>"

    .line 2
    .line 3
    const-string v1, "<appmsg"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    :goto_0
    move-object v7, v2

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    const-string v2, "<msg>"

    .line 39
    .line 40
    const-string v3, "</msg>"

    .line 41
    .line 42
    invoke-static {v2, p2, v3}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-object v7, p2

    .line 48
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    const/4 v2, 0x0

    .line 53
    if-nez p2, :cond_3

    .line 54
    .line 55
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_4

    .line 60
    .line 61
    :cond_3
    move-object v3, p0

    .line 62
    goto/16 :goto_10

    .line 63
    .line 64
    :cond_4
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    const-string v3, "<"

    .line 69
    .line 70
    invoke-virtual {p2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_18

    .line 75
    .line 76
    const-string v3, ">"

    .line 77
    .line 78
    invoke-virtual {p2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_18

    .line 83
    .line 84
    const/16 v3, 0x3e

    .line 85
    .line 86
    invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(I)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    const/4 v9, 0x1

    .line 91
    if-le p2, v9, :cond_18

    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    const/16 v10, 0x31

    .line 102
    .line 103
    if-eqz v1, :cond_17

    .line 104
    .line 105
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_17

    .line 110
    .line 111
    iget-object p2, p0, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 112
    .line 113
    iget-object v4, p2, Lh/Hchat/dexkit/DexFinder;->sendXmlAppMsgMethod:Ljava/lang/reflect/Method;

    .line 114
    .line 115
    if-eqz v4, :cond_16

    .line 116
    .line 117
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    aget-object v0, v0, v2

    .line 122
    .line 123
    iget-object v1, p2, Lh/Hchat/dexkit/DexFinder;->appMsgParseMethod:Ljava/lang/reflect/Method;

    .line 124
    .line 125
    invoke-static {v0, v1}, Lk8/g;->n(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 126
    .line 127
    .line 128
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 129
    const/4 v11, 0x0

    .line 130
    if-nez v3, :cond_5

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    :try_start_1
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v1, v11, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    if-eqz v3, :cond_6

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :catchall_0
    :cond_6
    :goto_2
    move-object v1, v11

    .line 149
    :goto_3
    if-eqz v1, :cond_7

    .line 150
    .line 151
    move-object v5, v1

    .line 152
    goto :goto_7

    .line 153
    :cond_7
    :try_start_2
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_c

    .line 166
    .line 167
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Ljava/lang/reflect/Method;

    .line 172
    .line 173
    invoke-static {v0, v3}, Lk8/g;->n(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-nez v5, :cond_9

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_9
    invoke-static {v0, v3}, Lk8/g;->n(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 181
    .line 182
    .line 183
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 184
    if-nez v5, :cond_a

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_a
    :try_start_3
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-static {v3, v11, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-virtual {v0, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 199
    if-eqz v6, :cond_b

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :catchall_1
    :cond_b
    :goto_5
    move-object v5, v11

    .line 203
    :goto_6
    if-eqz v5, :cond_8

    .line 204
    .line 205
    :try_start_4
    iput-object v3, p2, Lh/Hchat/dexkit/DexFinder;->appMsgParseMethod:Ljava/lang/reflect/Method;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :catchall_2
    :cond_c
    move-object v5, v11

    .line 209
    :goto_7
    if-nez v5, :cond_d

    .line 210
    .line 211
    :try_start_5
    const-string p1, "\u53d1\u9001XML\u5931\u8d25: \u5fae\u4fe1\u89e3\u6790AppMsg\u5931\u8d25"

    .line 212
    .line 213
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 214
    .line 215
    .line 216
    move-object v3, p0

    .line 217
    goto/16 :goto_f

    .line 218
    .line 219
    :catchall_3
    move-exception v0

    .line 220
    move-object p1, v0

    .line 221
    move-object v3, p0

    .line 222
    goto/16 :goto_e

    .line 223
    .line 224
    :cond_d
    :try_start_6
    invoke-static {v7}, Lk8/g;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 228
    move-object v3, p0

    .line 229
    move-object v6, p1

    .line 230
    :try_start_7
    invoke-virtual/range {v3 .. v8}, Lk8/g;->c(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    array-length p2, p1

    .line 235
    const/16 v0, 0xc

    .line 236
    .line 237
    if-ne p2, v0, :cond_e

    .line 238
    .line 239
    const/16 p2, 0x9

    .line 240
    .line 241
    aget-object p2, p1, p2

    .line 242
    .line 243
    if-nez p2, :cond_e

    .line 244
    .line 245
    const-string p1, "\u53d1\u9001XML\u5931\u8d25: MsgIdTalker\u53c2\u6570\u521b\u5efa\u5931\u8d25"

    .line 246
    .line 247
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_f

    .line 251
    .line 252
    :catchall_4
    move-exception v0

    .line 253
    :goto_8
    move-object p1, v0

    .line 254
    goto/16 :goto_e

    .line 255
    .line 256
    :cond_e
    invoke-static {v4, v11, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    instance-of p2, p1, Landroid/util/Pair;

    .line 261
    .line 262
    if-nez p2, :cond_10

    .line 263
    .line 264
    :cond_f
    :goto_9
    move v9, v2

    .line 265
    goto :goto_b

    .line 266
    :cond_10
    move-object p2, p1

    .line 267
    check-cast p2, Landroid/util/Pair;

    .line 268
    .line 269
    iget-object v0, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 270
    .line 271
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 272
    .line 273
    instance-of v1, v0, Ljava/lang/Number;

    .line 274
    .line 275
    if-eqz v1, :cond_11

    .line 276
    .line 277
    check-cast v0, Ljava/lang/Number;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    goto :goto_a

    .line 284
    :cond_11
    const/4 v0, -0x1

    .line 285
    :goto_a
    if-eqz v0, :cond_12

    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_12
    instance-of v0, p2, Ljava/lang/Number;

    .line 289
    .line 290
    if-eqz v0, :cond_13

    .line 291
    .line 292
    check-cast p2, Ljava/lang/Number;

    .line 293
    .line 294
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 295
    .line 296
    .line 297
    move-result-wide v0

    .line 298
    const-wide/16 v4, 0x0

    .line 299
    .line 300
    cmp-long p2, v0, v4

    .line 301
    .line 302
    if-ltz p2, :cond_f

    .line 303
    .line 304
    :cond_13
    :goto_b
    if-nez v9, :cond_15

    .line 305
    .line 306
    new-instance p2, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    .line 310
    .line 311
    const-string v0, "\u53d1\u9001XML\u5931\u8d25: AppMsgLogic\u8fd4\u56de "

    .line 312
    .line 313
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    instance-of v0, p1, Landroid/util/Pair;

    .line 317
    .line 318
    if-nez v0, :cond_14

    .line 319
    .line 320
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    goto :goto_c

    .line 325
    :cond_14
    check-cast p1, Landroid/util/Pair;

    .line 326
    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v1, "first="

    .line 330
    .line 331
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 335
    .line 336
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v1, ", second="

    .line 340
    .line 341
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 345
    .line 346
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    :goto_c
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    goto :goto_d

    .line 364
    :cond_15
    invoke-virtual {p0, v6, v7, v10, v8}, Lk8/g;->e(Ljava/lang/String;Ljava/lang/String;ILjava/io/Serializable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 365
    .line 366
    .line 367
    :goto_d
    move v2, v9

    .line 368
    goto :goto_f

    .line 369
    :catchall_5
    move-exception v0

    .line 370
    move-object v3, p0

    .line 371
    goto :goto_8

    .line 372
    :goto_e
    new-instance p2, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    const-string v0, "\u53d1\u9001XML\u5f02\u5e38: "

    .line 375
    .line 376
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    :goto_f
    return v2

    .line 394
    :cond_16
    move-object v3, p0

    .line 395
    const-string p1, "\u53d1\u9001XML\u5931\u8d25: AppMsgLogic API \u672a\u5c31\u7eea"

    .line 396
    .line 397
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    return v2

    .line 401
    :cond_17
    move-object v3, p0

    .line 402
    move-object v6, p1

    .line 403
    invoke-virtual {p0, v10, v6, v7}, Lk8/g;->v(ILjava/lang/String;Ljava/lang/String;)Z

    .line 404
    .line 405
    .line 406
    move-result p1

    .line 407
    return p1

    .line 408
    :cond_18
    move-object v3, p0

    .line 409
    const-string p1, "\u53d1\u9001XML\u5931\u8d25: \u5185\u5bb9\u4e0d\u662fXML"

    .line 410
    .line 411
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    return v2

    .line 415
    :goto_10
    const-string p1, "\u53d1\u9001XML\u5931\u8d25: talker/xml \u4e3a\u7a7a"

    .line 416
    .line 417
    invoke-virtual {p0, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    return v2
.end method
