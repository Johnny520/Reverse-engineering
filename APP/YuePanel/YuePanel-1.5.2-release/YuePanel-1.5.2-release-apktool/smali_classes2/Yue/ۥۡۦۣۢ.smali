.class public final LYue/ۥۡۦۣۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n22#2,3:397\n1#3:400\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n102#1:397,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۣۢ$ۥ;,
        LYue/ۥۡۦۣۢ$ۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n22#2,3:397\n1#3:400\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n102#1:397,3\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟۠ۥ:LYue/ۥۡۦۣۢ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥۣ۟۟۠:Ljava/util/regex/Pattern;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Ljava/util/Set;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "LYue/\u06e5\u06e1\u06e6\u06e3\u06e5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۦۣۢ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۦۣۢ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۦۣۢ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۣۢ$ۥ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "pattern"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    const-string v0, "compile(pattern)"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LYue/ۥۡۦۣۢ;-><init>(Ljava/util/regex/Pattern;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LYue/ۥۡۦۣۥ;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۦۣۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "pattern"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, LYue/ۥۡۦۣۢ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۣۢ$ۥ;

    invoke-virtual {p2}, LYue/ۥۡۦۣۥ;->getValue()I

    move-result p2

    invoke-static {v0, p2}, LYue/ۥۡۦۣۢ$ۥ;->ۥ(LYue/ۥۡۦۣۢ$ۥ;I)I

    move-result p2

    invoke-static {p1, p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p1

    const-string p2, "compile(pattern, ensureUnicodeCase(option.value))"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LYue/ۥۡۦۣۢ;-><init>(Ljava/util/regex/Pattern;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/Set;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "+",
            "LYue/\u06e5\u06e1\u06e6\u06e3\u06e5;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pattern"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, LYue/ۥۡۦۣۢ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۣۢ$ۥ;

    invoke-static {p2}, LYue/ۥۡۦۣۤ;->ۥ۟۟۟۟(Ljava/lang/Iterable;)I

    move-result p2

    invoke-static {v0, p2}, LYue/ۥۡۦۣۢ$ۥ;->ۥ(LYue/ۥۡۦۣۢ$ۥ;I)I

    move-result p2

    invoke-static {p1, p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p1

    const-string p2, "compile(pattern, ensureU\u2026odeCase(options.toInt()))"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LYue/ۥۡۦۣۢ;-><init>(Ljava/util/regex/Pattern;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 1
    .param p1    # Ljava/util/regex/Pattern;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    const-string v0, "nativePattern"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static final synthetic ۥ(LYue/ۥۡۦۣۢ;)Ljava/util/regex/Pattern;
    .locals 0

    iget-object p0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥۡۦۣۢ;Ljava/lang/CharSequence;IILjava/lang/Object;)LYue/ۥۡ۟۟;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۣۢ;->ۥ۟۟(Ljava/lang/CharSequence;I)LYue/ۥۡ۟۟;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟۠(LYue/ۥۡۦۣۢ;Ljava/lang/CharSequence;IILjava/lang/Object;)LYue/ۥۡۨۢ;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۣۢ;->ۥ۟۟۟۟(Ljava/lang/CharSequence;I)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۠۠(LYue/ۥۡۦۣۢ;Ljava/lang/CharSequence;IILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۣۢ;->ۥ۟۟۠۟(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۠ۢ(LYue/ۥۡۦۣۢ;Ljava/lang/CharSequence;IILjava/lang/Object;)LYue/ۥۡۨۢ;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۣۢ;->ۥ۟۟۠ۡ(Ljava/lang/CharSequence;I)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nativePattern.toString()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۥ۟(Ljava/lang/CharSequence;)Z
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟(Ljava/lang/CharSequence;I)LYue/ۥۡ۟۟;
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "nativePattern.matcher(input)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p2, p1}, LYue/ۥۡۦۣۤ;->ۥ(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LYue/ۥۡ۟۟;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟۟(Ljava/lang/CharSequence;I)LYue/ۥۡۨۢ;
    .locals 3
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "LYue/\u06e5\u06e1\u06df\u06df;",
            ">;"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p2, v0, :cond_0

    new-instance v0, LYue/ۥۡۦۣۢ$ۥ۟۟;

    invoke-direct {v0, p0, p1, p2}, LYue/ۥۡۦۣۢ$ۥ۟۟;-><init>(LYue/ۥۡۦۣۢ;Ljava/lang/CharSequence;I)V

    sget-object p1, LYue/ۥۡۦۣۢ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۦۣۢ$ۥ۟۟۟;

    invoke-static {v0, p1}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟ۧ(LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Start index out of bounds: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", input length: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟ۡ()Ljava/util/Set;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e1\u06e6\u06e3\u06e5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥ۟۟۠ۤ:Ljava/util/Set;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->flags()I

    move-result v0

    const-class v1, LYue/ۥۡۦۣۥ;

    invoke-static {v1}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    const-string v2, "fromInt$lambda$1"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LYue/ۥۡۦۣۢ$ۥ۟۟۟۟;

    invoke-direct {v2, v0}, LYue/ۥۡۦۣۢ$ۥ۟۟۟۟;-><init>(I)V

    invoke-static {v1, v2}, LYue/ۥ۟ۥۡۨ;->ۥ۟۟ۧ(Ljava/lang/Iterable;LYue/ۥۣ۠ۡ۟;)Z

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    const-string v1, "unmodifiableSet(EnumSet.\u2026mask == it.value }\n    })"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LYue/ۥۡۦۣۢ;->ۥ۟۟۠ۤ:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nativePattern.pattern()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۥۣ۟۟۟(Ljava/lang/CharSequence;I)LYue/ۥۡ۟۟;
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->useAnchoringBounds(Z)Ljava/util/regex/Matcher;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->useTransparentBounds(Z)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {v0, p2, v1}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥۡ۟۟۟;

    const-string v1, "this"

    invoke-static {p2, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p2, p1}, LYue/ۥۡ۟۟۟;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final ۥ۟۟۟ۤ(Ljava/lang/CharSequence;)LYue/ۥۡ۟۟;
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "nativePattern.matcher(input)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LYue/ۥۡۦۣۤ;->ۥ۟(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)LYue/ۥۡ۟۟;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۥ(Ljava/lang/CharSequence;)Z
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟ۦ(Ljava/lang/CharSequence;I)Z
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->useAnchoringBounds(Z)Ljava/util/regex/Matcher;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->useTransparentBounds(Z)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-virtual {v0, p2, p1}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟ۧ(Ljava/lang/CharSequence;LYue/ۥۣ۠ۡ۟;)Ljava/lang/String;
    .locals 5
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e1\u06df\u06df;",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, LYue/ۥۡۦۣۢ;->ۥ۟۟۟(LYue/ۥۡۦۣۢ;Ljava/lang/CharSequence;IILjava/lang/Object;)LYue/ۥۡ۟۟;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    :cond_1
    invoke-interface {v0}, LYue/ۥۡ۟۟;->getRange()LYue/ۥ۠ۥۣۨ;

    move-result-object v4

    invoke-virtual {v4}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠۟()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3, p1, v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-interface {p2, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, LYue/ۥۡ۟۟;->getRange()LYue/ۥ۠ۥۣۨ;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v0}, LYue/ۥۡ۟۟;->next()LYue/ۥۡ۟۟;

    move-result-object v0

    if-ge v2, v1, :cond_2

    if-nez v0, :cond_1

    :cond_2
    if-ge v2, v1, :cond_3

    invoke-virtual {v3, p1, v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "sb.toString()"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ۥ۟۟۟ۨ(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replacement"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "nativePattern.matcher(in\u2026).replaceAll(replacement)"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ۥ۟۟۠(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replacement"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "nativePattern.matcher(in\u2026replaceFirst(replacement)"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ۥ۟۟۠۟(Ljava/lang/CharSequence;I)Ljava/util/List;
    .locals 4
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

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

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۢ۠ۢۥ;->ۥ۟ۡۥۣ(I)V

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_5

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    if-lez p2, :cond_1

    invoke-static {p2, v3}, LYue/ۥۡۦ۟;->ۥ۟۟ۡ۠(II)I

    move-result v3

    :cond_1
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    sub-int/2addr p2, v1

    const/4 v1, 0x0

    :cond_2
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    invoke-interface {p1, v1, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v1

    if-ltz p2, :cond_3

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-eq v3, p2, :cond_4

    :cond_3
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-interface {p1, v1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v2

    :cond_5
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟ۥۡۢ;->ۥ۟۟۟ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۠ۡ(Ljava/lang/CharSequence;I)LYue/ۥۡۨۢ;
    .locals 2
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.6"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۢ۠ۢۥ;->ۥ۟ۡۥۣ(I)V

    new-instance v0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;-><init>(LYue/ۥۡۦۣۢ;Ljava/lang/CharSequence;ILYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۡۨۢۢ;->ۥ۟(LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۨۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥۣ۟۟۠()Ljava/util/regex/Pattern;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public final ۥ۟۟۠ۤ()Ljava/lang/Object;
    .locals 3

    new-instance v0, LYue/ۥۡۦۣۢ$ۥ۟;

    iget-object v1, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v1

    const-string v2, "nativePattern.pattern()"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LYue/ۥۡۦۣۢ;->ۥۣ۟۟۠:Ljava/util/regex/Pattern;

    invoke-virtual {v2}, Ljava/util/regex/Pattern;->flags()I

    move-result v2

    invoke-direct {v0, v1, v2}, LYue/ۥۡۦۣۢ$ۥ۟;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method
