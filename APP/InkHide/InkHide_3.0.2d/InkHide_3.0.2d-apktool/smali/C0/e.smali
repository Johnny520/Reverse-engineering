.class public final LC0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC0/e;

.field public static final b:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static volatile c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LC0/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LC0/e;->a:LC0/e;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LC0/e;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    const-class v0, Ljava/util/Map;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    array-length v0, v0

    .line 29
    const/4 v2, 0x3

    .line 30
    if-ne v0, v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v0, "getParameterTypes(...)"

    .line 37
    .line 38
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    array-length v0, p0

    .line 42
    move v2, v1

    .line 43
    :goto_0
    if-ge v2, v0, :cond_1

    .line 44
    .line 45
    aget-object v3, p0, v2

    .line 46
    .line 47
    const-class v4, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v3, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 p0, 0x1

    .line 60
    return p0

    .line 61
    :cond_2
    :goto_1
    return v1
.end method
