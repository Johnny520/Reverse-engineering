.class public final Lkotlin/text/Regex;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/text/Regex$Serialized;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0011\u0018\u0000 A2\u00060\u0001j\u0002`\u0002:\u0002BCB\u0011\u0008\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u0011\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\tB\u0019\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0005\u0010\u000cB\u001f\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\r\u00a2\u0006\u0004\u0008\u0005\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0018H\u0086\u0004\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ!\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008 \u0010!J%\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\"2\u0006\u0010\u0014\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u0018\u00a2\u0006\u0004\u0008%\u0010&J!\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u001dH\u0007\u00a2\u0006\u0004\u0008(\u0010!J\u001f\u0010)\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u001dH\u0007\u00a2\u0006\u0004\u0008)\u0010*J\u001d\u0010,\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0007\u00a2\u0006\u0004\u0008,\u0010-J)\u0010,\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00180.\u00a2\u0006\u0004\u0008,\u00100J\u001d\u00101\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0007\u00a2\u0006\u0004\u00081\u0010-J%\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u0007032\u0006\u0010\u0014\u001a\u00020\u00182\u0008\u0008\u0002\u00102\u001a\u00020\u001d\u00a2\u0006\u0004\u00084\u00105J\'\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00070\"2\u0006\u0010\u0014\u001a\u00020\u00182\u0008\u0008\u0002\u00102\u001a\u00020\u001dH\u0007\u00a2\u0006\u0004\u00086\u0010$J\u000f\u00107\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u00087\u00108J\r\u00109\u001a\u00020\u0003\u00a2\u0006\u0004\u00089\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010;R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0011\u0010\u0008\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008>\u00108R\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\r8F\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010@\u00a8\u0006D"
    }
    d2 = {
        "Lkotlin/text/Regex;",
        "Ljava/io/Serializable;",
        "Lkotlin/io/Serializable;",
        "Ljava/util/regex/Pattern;",
        "nativePattern",
        "<init>",
        "(Ljava/util/regex/Pattern;)V",
        "",
        "pattern",
        "(Ljava/lang/String;)V",
        "Lkotlin/text/RegexOption;",
        "option",
        "(Ljava/lang/String;Lkotlin/text/RegexOption;)V",
        "",
        "options",
        "(Ljava/lang/String;Ljava/util/Set;)V",
        "",
        "writeReplace",
        "()Ljava/lang/Object;",
        "Ljava/io/ObjectInputStream;",
        "input",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "readObject",
        "(Ljava/io/ObjectInputStream;)V",
        "",
        "",
        "matches",
        "(Ljava/lang/CharSequence;)Z",
        "containsMatchIn",
        "",
        "startIndex",
        "Lkotlin/text/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
        "find",
        "(Ljava/lang/CharSequence;I)Lkotlin/text/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
        "Lkotlin/sequences/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
        "findAll",
        "(Ljava/lang/CharSequence;I)Lkotlin/sequences/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
        "matchEntire",
        "(Ljava/lang/CharSequence;)Lkotlin/text/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
        "index",
        "matchAt",
        "matchesAt",
        "(Ljava/lang/CharSequence;I)Z",
        "replacement",
        "replace",
        "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;",
        "Lkotlin/Function1;",
        "transform",
        "(Ljava/lang/CharSequence;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;)Ljava/lang/String;",
        "replaceFirst",
        "limit",
        "",
        "split",
        "(Ljava/lang/CharSequence;I)Ljava/util/List;",
        "splitToSequence",
        "toString",
        "()Ljava/lang/String;",
        "toPattern",
        "()Ljava/util/regex/Pattern;",
        "Ljava/util/regex/Pattern;",
        "_options",
        "Ljava/util/Set;",
        "getPattern",
        "getOptions",
        "()Ljava/util/Set;",
        "Companion",
        "Serialized",
        "kotlin/text/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lkotlin/text/飘花落叶言子楪哲世苏兰;


# instance fields
.field private _options:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "Lkotlin/text/RegexOption;",
            ">;"
        }
    .end annotation
.end field

.field private final nativePattern:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlin/text/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/text/Regex;->Companion:Lkotlin/text/飘花落叶言子楪哲世苏兰;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, p1}, Lkotlin/text/Regex;-><init>(Ljava/util/regex/Pattern;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "+",
            "Lkotlin/text/RegexOption;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lkotlin/text/Regex;->Companion:Lkotlin/text/飘花落叶言子楪哲世苏兰;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lkotlin/text/RegexOption;

    .line 27
    .line 28
    invoke-virtual {v2}, Lkotlin/text/RegexOption;->getValue()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    or-int/2addr v1, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 p2, v1, 0x2

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    or-int/lit8 v1, v1, 0x40

    .line 42
    .line 43
    :cond_1
    invoke-static {p1, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, p1}, Lkotlin/text/Regex;-><init>(Ljava/util/regex/Pattern;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkotlin/text/RegexOption;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    sget-object v0, Lkotlin/text/Regex;->Companion:Lkotlin/text/飘花落叶言子楪哲世苏兰;

    invoke-virtual {p2}, Lkotlin/text/RegexOption;->getValue()I

    move-result p2

    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p2, p2, 0x40

    .line 57
    :cond_0
    invoke-static {p1, p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, p1}, Lkotlin/text/Regex;-><init>(Ljava/util/regex/Pattern;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static final synthetic access$getNativePattern$p(Lkotlin/text/Regex;)Ljava/util/regex/Pattern;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lkotlin/text/Regex;->find(Ljava/lang/CharSequence;I)Lkotlin/text/飘花落叶言子楪苏哲世兰;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic findAll$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lkotlin/text/Regex;->findAll(Ljava/lang/CharSequence;I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final findAll$lambda$0(Lkotlin/text/Regex;Ljava/lang/CharSequence;I)Lkotlin/text/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lkotlin/text/Regex;->find(Ljava/lang/CharSequence;I)Lkotlin/text/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/io/InvalidObjectException;

    .line 2
    .line 3
    const-string p1, "Deserialization is supported via proxy only"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public static synthetic split$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic splitToSequence$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lkotlin/text/Regex;->splitToSequence(Ljava/lang/CharSequence;I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/text/Regex$Serialized;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/regex/Pattern;->flags()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-direct {v0, v1, p0}, Lkotlin/text/Regex$Serialized;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Lkotlin/text/Regex;Ljava/lang/CharSequence;I)Lkotlin/text/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lkotlin/text/Regex;->findAll$lambda$0(Lkotlin/text/Regex;Ljava/lang/CharSequence;I)Lkotlin/text/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final containsMatchIn(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final find(Ljava/lang/CharSequence;I)Lkotlin/text/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Ljava/util/regex/Matcher;->find(I)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance p2, Lkotlin/text/飘花落叶言子楪苏兰世哲;

    .line 22
    .line 23
    invoke-direct {p2, p0, p1}, Lkotlin/text/飘花落叶言子楪苏兰世哲;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-object p2
.end method

.method public final findAll(Ljava/lang/CharSequence;I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "Lkotlin/sequences/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-ltz p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-gt p2, v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lkotlin/text/飘花落叶言子楪苏兰哲世;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, p2}, Lkotlin/text/飘花落叶言子楪苏兰哲世;-><init>(Lkotlin/text/Regex;Ljava/lang/CharSequence;I)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/text/Regex$findAll$2;->INSTANCE:Lkotlin/text/Regex$findAll$2;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance p1, Lkotlin/io/飘花落叶言子楪苏哲世兰;

    .line 23
    .line 24
    invoke-direct {p1, v0, p0}, Lkotlin/io/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    const-string p0, "Start index out of bounds: "

    .line 29
    .line 30
    const-string v0, ", input length: "

    .line 31
    .line 32
    invoke-static {p2, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p0, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/StringBuilder;I)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public final getOptions()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lkotlin/text/RegexOption;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/text/Regex;->_options:Ljava/util/Set;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/regex/Pattern;->flags()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-class v1, Lkotlin/text/RegexOption;

    .line 12
    .line 13
    invoke-static {v1}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/Enum;

    .line 35
    .line 36
    check-cast v3, Lkotlin/text/RegexOption;

    .line 37
    .line 38
    invoke-virtual {v3}, Lkotlin/text/RegexOption;->getMask()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    and-int/2addr v4, v0

    .line 43
    invoke-virtual {v3}, Lkotlin/text/RegexOption;->getValue()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-ne v4, v3, :cond_1

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v3, 0x0

    .line 52
    :goto_1
    if-nez v3, :cond_0

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lkotlin/text/Regex;->_options:Ljava/util/Set;

    .line 66
    .line 67
    :cond_3
    return-object v0
.end method

.method public final getPattern()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final matchAt(Ljava/lang/CharSequence;I)Lkotlin/text/飘花落叶言子楪苏哲世兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->useAnchoringBounds(Z)Ljava/util/regex/Matcher;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->useTransparentBounds(Z)Ljava/util/regex/Matcher;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0, p2, v0}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->lookingAt()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    new-instance p2, Lkotlin/text/飘花落叶言子楪苏兰世哲;

    .line 35
    .line 36
    invoke-direct {p2, p0, p1}, Lkotlin/text/飘花落叶言子楪苏兰世哲;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    return-object p2

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public final matchEntire(Ljava/lang/CharSequence;)Lkotlin/text/飘花落叶言子楪苏哲世兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance v0, Lkotlin/text/飘花落叶言子楪苏兰世哲;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, Lkotlin/text/飘花落叶言子楪苏兰世哲;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final matches(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final matchesAt(Ljava/lang/CharSequence;I)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->useAnchoringBounds(Z)Ljava/util/regex/Matcher;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->useTransparentBounds(Z)Ljava/util/regex/Matcher;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, p2, p1}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->lookingAt()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final replace(Ljava/lang/CharSequence;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p0, p1, v2, v0, v1}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/飘花落叶言子楪苏哲世兰;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    move-object v3, p0

    .line 31
    check-cast v3, Lkotlin/text/飘花落叶言子楪苏兰世哲;

    .line 32
    .line 33
    invoke-virtual {v3}, Lkotlin/text/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲()L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v4, v4, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 38
    .line 39
    invoke-virtual {v1, p1, v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-interface {p2, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ljava/lang/CharSequence;

    .line 47
    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Lkotlin/text/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲()L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget p0, p0, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 56
    .line 57
    add-int/lit8 v2, p0, 0x1

    .line 58
    .line 59
    invoke-virtual {v3}, Lkotlin/text/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰()Lkotlin/text/飘花落叶言子楪苏兰世哲;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-ge v2, v0, :cond_2

    .line 64
    .line 65
    if-nez p0, :cond_1

    .line 66
    .line 67
    :cond_2
    if-ge v2, v0, :cond_3

    .line 68
    .line 69
    invoke-virtual {v1, p1, v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public final replaceFirst(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p2}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public final split(Ljava/lang/CharSequence;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲楪世苏兰(I)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p2, v0, :cond_6

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    if-lez p2, :cond_2

    .line 28
    .line 29
    if-le p2, v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v2, p2

    .line 33
    :cond_2
    :goto_0
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    sub-int/2addr p2, v0

    .line 37
    const/4 v0, 0x0

    .line 38
    :cond_3
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->start()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-interface {p1, v0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->end()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-ltz p2, :cond_4

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eq v2, p2, :cond_5

    .line 64
    .line 65
    :cond_4
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    :cond_5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    invoke-interface {p1, v0, p0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_6
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method

.method public final splitToSequence(Ljava/lang/CharSequence;I)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "Lkotlin/sequences/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲楪世苏兰(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lkotlin/text/Regex$splitToSequence$1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, p1, p2, v1}, Lkotlin/text/Regex$splitToSequence$1;-><init>(Lkotlin/text/Regex;Ljava/lang/CharSequence;ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Lkotlin/collections/飘花落叶言子楪哲苏世兰;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, v0, p1}, Lkotlin/collections/飘花落叶言子楪哲苏世兰;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public final toPattern()Ljava/util/regex/Pattern;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/text/Regex;->nativePattern:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/regex/Pattern;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method
