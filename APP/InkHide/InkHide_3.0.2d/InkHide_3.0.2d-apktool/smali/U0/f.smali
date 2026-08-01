.class public final synthetic LU0/f;
.super LN0/f;
.source "SourceFile"

# interfaces
.implements LM0/l;


# static fields
.field public static final i:LU0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LU0/f;

    .line 2
    .line 3
    const-string v1, "next()Lkotlin/text/MatchResult;"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-class v3, LU0/d;

    .line 7
    .line 8
    const-string v4, "next"

    .line 9
    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, LN0/f;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sput-object v0, LU0/f;->i:LU0/f;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, LU0/d;

    .line 2
    .line 3
    const-string v0, "p0"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, LU0/d;->a:Ljava/util/regex/Matcher;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ne v2, v3, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v2, 0x0

    .line 27
    :goto_0
    add-int/2addr v1, v2

    .line 28
    iget-object p1, p1, LU0/d;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    if-gt v1, v2, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->pattern()Ljava/util/regex/Pattern;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v2, "matcher(...)"

    .line 46
    .line 47
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->find(I)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_1
    new-instance v1, LU0/d;

    .line 58
    .line 59
    invoke-direct {v1, v0, p1}, LU0/d;-><init>(Ljava/util/regex/Matcher;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_2
    return-object v3
.end method
