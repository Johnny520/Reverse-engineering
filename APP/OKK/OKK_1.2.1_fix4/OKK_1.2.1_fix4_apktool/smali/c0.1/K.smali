.class public abstract Lc0/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LW0/g;

.field public static final b:LW0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LW0/g;

    const-string v1, "<appmsg\\b[\\s\\S]*?<type>\\s*(\\d+)\\s*</type>"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LW0/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc0/K;->a:LW0/g;

    new-instance v0, LW0/g;

    const-string v1, "&lt;appmsg\\b[\\s\\S]*?&lt;type&gt;\\s*(\\d+)\\s*&lt;/type&gt;"

    invoke-direct {v0, v1, v2}, LW0/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc0/K;->b:LW0/g;

    return-void
.end method

.method public static a(Ljava/lang/String;I)Z
    .locals 3

    const-string v0, "content"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x31

    if-ne p1, v0, :cond_0

    :goto_0
    move p1, v0

    goto :goto_1

    :cond_0
    const v1, 0xffff

    and-int/2addr v1, p1

    if-ne v1, v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v1, 0x1

    if-eq p1, v1, :cond_9

    const/4 v2, 0x0

    if-eq p1, v0, :cond_3

    :cond_2
    :goto_2
    move v1, v2

    goto :goto_4

    :cond_3
    invoke-static {p0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toLowerCase(...)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<refermsg"

    invoke-static {p1, v0, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "&lt;refermsg"

    invoke-static {p1, v0, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_5
    sget-object p1, Lc0/K;->a:LW0/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, LW0/g;->a:Ljava/util/regex/Pattern;

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    const-string v0, "matcher(...)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2, p0}, LU/S;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, LW0/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v1}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_8

    :cond_6
    sget-object p1, Lc0/K;->b:LW0/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, LW0/g;->a:Ljava/util/regex/Pattern;

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2, p0}, LU/S;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, LW0/d;->a()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v1}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p0

    move-object p1, p0

    check-cast p1, Ljava/lang/String;

    goto :goto_3

    :cond_7
    const/4 p1, 0x0

    :cond_8
    :goto_3
    const-string p0, "57"

    invoke-static {p1, p0}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    move v1, p0

    :cond_9
    :goto_4
    return v1
.end method
