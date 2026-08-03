.class public abstract Lc0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;

.field public static final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "\u6d88\u606f\u5df2\u64a4\u56de"

    const-string v1, "\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    const-string v2, "\u64a4\u56de\u4e00\u6761\u6d88\u606f"

    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc0/o;->a:Ljava/util/List;

    const-string v0, "\u4f60\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    const-string v1, "\u4f60\u64a4\u56de\u4e00\u6761\u6d88\u606f"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc0/o;->b:Ljava/util/List;

    return-void
.end method

.method public static a(Lc0/u1;Lc0/e1;ZLjava/lang/String;ZLjava/lang/String;)LU/S;
    .locals 9

    const-string v0, "noticeTemplate"

    invoke-static {p3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-virtual {v0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    sget-object v1, Lc0/s1;->z:Lc0/s1;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/16 v0, 0x2710

    iget v2, p0, Lc0/u1;->b:I

    if-eq v2, v0, :cond_1

    return-object v1

    :cond_1
    iget-object p0, p0, Lc0/u1;->c:Ljava/lang/String;

    invoke-static {p0}, Lc0/o;->l(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-static {p0}, Lc0/o;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p2, :cond_3

    return-object v1

    :cond_3
    const/16 p2, 0x20

    invoke-static {p2}, Lx0/e;->b(I)I

    move-result v1

    const-string v2, "<replacemsg>\\s*<!\\[CDATA\\[(.*?)]]>\\s*</replacemsg>"

    invoke-static {v2, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v2, "compile(...)"

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    const-string v3, "matcher(...)"

    invoke-static {v1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, p0}, LU/S;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LW0/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v6}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-static {v1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_4
    move-object v1, v5

    :goto_0
    if-eqz v1, :cond_5

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_7

    :cond_5
    invoke-static {p2}, Lx0/e;->b(I)I

    move-result p2

    const-string v1, "<replacemsg>(.*?)</replacemsg>"

    invoke-static {v1, p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-static {p2, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-static {p2, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v4, p0}, LU/S;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, LW0/d;->a()Ljava/util/List;

    move-result-object p2

    invoke-static {p2, v6}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_6

    invoke-static {p2}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-static {p2}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/2addr v1, v6

    if-eqz v1, :cond_6

    move-object v1, p2

    goto :goto_1

    :cond_6
    move-object v1, v5

    :cond_7
    :goto_1
    if-nez v1, :cond_8

    move-object v1, p0

    :cond_8
    const-string p2, ""

    if-nez p4, :cond_9

    new-instance p0, Lc0/t1;

    invoke-direct {p0, p2}, Lc0/t1;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_9
    invoke-static {p3}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result p4

    const-string v2, "{name}\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    if-eqz p4, :cond_a

    move-object p3, v2

    :cond_a
    invoke-static {p3}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v3

    const-string v7, "recalled a message"

    const-string v8, "<"

    if-nez v3, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {p4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_2

    :cond_c
    const-string v3, "{name}\u64a4\u56de\u4e86\u4e0a\u4e00\u6761\u6d88\u606f {content}"

    invoke-virtual {p4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_2

    :cond_d
    const-string v3, "{name}\u64a4\u56de\u4e86\u4e0a\u4e00\u6761\u6d88\u606f"

    invoke-virtual {p4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_17

    :goto_2
    if-eqz v0, :cond_e

    const-string p0, "\u4f60\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    invoke-static {p0}, Lc0/o;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_6

    :cond_e
    invoke-static {v1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    if-nez p3, :cond_f

    goto :goto_5

    :cond_f
    invoke-static {p1, v8, v4}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_10

    goto :goto_5

    :cond_10
    invoke-static {p1}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_16

    invoke-static {p1}, Lc0/o;->k(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_11

    goto :goto_5

    :cond_11
    const-string p3, "wxid_"

    invoke-static {p1, p3, v6}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_12

    goto :goto_5

    :cond_12
    sget-object p3, Lc0/o;->a:Ljava/util/List;

    instance-of p4, p3, Ljava/util/Collection;

    if-eqz p4, :cond_13

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_13

    goto :goto_3

    :cond_13
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_14
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_15

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-static {p1, p4, v4}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p4

    if-eqz p4, :cond_14

    goto :goto_4

    :cond_15
    :goto_3
    invoke-static {p1, v7, v6}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_16

    :goto_4
    invoke-static {v1}, Lc0/o;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_6

    :cond_16
    :goto_5
    invoke-static {v1, p0, p5, v0}, Lc0/o;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0, p2}, Lc0/o;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_6
    new-instance p1, Lc0/t1;

    invoke-direct {p1, p0}, Lc0/t1;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_17
    invoke-static {v1, p0, p5, v0}, Lc0/o;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const/16 p4, 0x50

    if-eqz p1, :cond_20

    iget-object p5, p1, Lc0/e1;->b:Ljava/lang/String;

    invoke-static {p5}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_29

    invoke-static {p5}, Lc0/o;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    goto/16 :goto_9

    :cond_18
    iget p1, p1, Lc0/e1;->a:I

    if-eq p1, v6, :cond_19

    const/16 v0, 0xb

    if-ne p1, v0, :cond_29

    :cond_19
    invoke-static {p5}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p5

    if-nez p5, :cond_1a

    goto/16 :goto_9

    :cond_1a
    invoke-static {p1, v8, v4}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p5

    if-eqz p5, :cond_1b

    goto/16 :goto_9

    :cond_1b
    invoke-static {p1}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result p5

    if-nez p5, :cond_29

    invoke-static {p1}, Lc0/o;->k(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_1c

    goto/16 :goto_9

    :cond_1c
    invoke-static {p1}, Lc0/o;->l(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_1d

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p5

    const/16 v0, 0x30

    if-ge p5, v0, :cond_1d

    goto/16 :goto_9

    :cond_1d
    invoke-static {p1}, Lc0/o;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    if-eqz p5, :cond_1e

    const-string v0, ":\n"

    invoke-virtual {p5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LW0/j;->U0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ":"

    invoke-virtual {p5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-static {p1, p5}, LW0/j;->U0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1e
    invoke-static {p1}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result p5

    if-nez p5, :cond_29

    invoke-static {p1, v8, v4}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p5

    if-eqz p5, :cond_1f

    goto :goto_9

    :cond_1f
    invoke-static {p1, p4}, LW0/j;->Z0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    goto :goto_9

    :cond_20
    invoke-static {v1}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_29

    invoke-static {v1}, Lc0/o;->k(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_21

    goto :goto_9

    :cond_21
    invoke-static {v1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result p5

    if-nez p5, :cond_23

    invoke-static {p1, v8, v4}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p5

    if-eqz p5, :cond_22

    goto :goto_7

    :cond_22
    invoke-static {p1}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_24

    :cond_23
    :goto_7
    move-object p1, v5

    goto :goto_8

    :cond_24
    invoke-static {p1}, Lc0/o;->l(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_25

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p5

    const/16 v0, 0x28

    if-ge p5, v0, :cond_25

    goto :goto_7

    :cond_25
    invoke-static {p1, v7, v6}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p5

    if-eqz p5, :cond_26

    goto :goto_7

    :cond_26
    invoke-static {p1, p4}, LW0/j;->Z0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    :goto_8
    if-eqz p1, :cond_27

    invoke-static {p1}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_27

    invoke-static {p1}, Lc0/o;->l(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_27

    move-object v5, p1

    :cond_27
    if-nez v5, :cond_28

    goto :goto_9

    :cond_28
    move-object p2, v5

    :cond_29
    :goto_9
    new-instance p1, Lc0/t1;

    invoke-static {p3, p0, p2}, Lc0/o;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lc0/t1;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "<this>"

    const/4 v4, 0x6

    const/4 v5, 0x0

    if-eqz p0, :cond_10

    invoke-static {p0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    new-array v6, v4, [C

    fill-array-data v6, :array_0

    invoke-static {p0, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v2

    move v8, v1

    move v9, v8

    :goto_0
    if-gt v8, v7, :cond_5

    if-nez v9, :cond_1

    move v10, v8

    goto :goto_1

    :cond_1
    move v10, v7

    :goto_1
    invoke-virtual {p0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-static {v6, v10}, LE0/j;->i0([CC)Z

    move-result v10

    if-nez v9, :cond_3

    if-nez v10, :cond_2

    move v9, v2

    goto :goto_0

    :cond_2
    add-int/2addr v8, v2

    goto :goto_0

    :cond_3
    if-nez v10, :cond_4

    goto :goto_2

    :cond_4
    add-int/2addr v7, v0

    goto :goto_0

    :cond_5
    :goto_2
    add-int/2addr v7, v2

    invoke-virtual {p0, v8, v7}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v6, " : "

    invoke-static {p0, v6, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-static {p0, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "missingDelimiterValue"

    invoke-static {p0, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v6, v1, v1, v4}, LW0/j;->P0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v3

    if-ne v3, v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    const-string v0, "\u5bf9\u65b9"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_4
    return-object v5

    :cond_9
    const-string v0, "\u4f60"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    return-object v0

    :cond_a
    invoke-static {p0}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_10

    invoke-static {p0}, Lc0/o;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_5

    :cond_b
    const-string v0, "wxid_"

    invoke-static {p0, v0, v2}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    return-object v5

    :cond_c
    const-string v0, "@chatroom"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_10

    const-string v0, "@im.chatroom"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_5

    :cond_d
    const-string v0, "(?i)^[a-f0-9]{32,}$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_e

    return-object v5

    :cond_e
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x28

    if-le v0, v1, :cond_f

    invoke-static {p0, v1}, LW0/j;->Z0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    :cond_f
    return-object p0

    :cond_10
    :goto_5
    return-object v5

    nop

    :array_0
    .array-data 2
        0x22s
        0x201cs
        0x201ds
        0x27s
        0x300cs
        0x300ds
    .end array-data
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    const-string v1, ":\n"

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {p0, v1, v2, v2, v3}, LW0/j;->P0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v1

    const/16 v4, 0x41

    const-string v5, "substring(...)"

    const/4 v6, 0x1

    if-gt v6, v1, :cond_3

    if-ge v1, v4, :cond_3

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc0/o;->h(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    return-object v1

    :cond_3
    const/16 v1, 0x3a

    invoke-static {p0, v1, v2, v2, v3}, LW0/j;->O0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    if-gt v6, v1, :cond_4

    if-ge v1, v4, :cond_4

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x20

    invoke-static {v3, v4}, LW0/j;->K0(Ljava/lang/CharSequence;C)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc0/o;->h(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/2addr v1, v6

    if-le p0, v1, :cond_4

    return-object v2

    :cond_4
    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    invoke-static {p0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "replacemsg"

    invoke-static {p0, v1}, Lc0/o;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lc0/o;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    const/4 v1, 0x2

    invoke-static {v1}, Lx0/e;->b(I)I

    move-result v1

    const-string v2, "[\"\u201c\'\u300c]([^\"\u201d\'\u300d]{1,40})[\"\u201d\'\u300d]\\s*recalled"

    invoke-static {v2, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v2, "compile(...)"

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    const-string v3, "matcher(...)"

    invoke-static {v1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v1, v4, p0}, LU/S;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;

    move-result-object v1

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LW0/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v5}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-static {v1}, Lc0/o;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    const-string v1, "^[\"\u201c\'\u300c]?([^\"\u201d\'\u300d\\n]{1,40}?)[\"\u201d\'\u300d]?\\s*\u64a4\u56de"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-static {v1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4, p0}, LU/S;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;

    move-result-object v1

    const-string v6, "\u4f60"

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LW0/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v5}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-static {v1}, Lc0/o;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    xor-int/2addr v7, v5

    if-eqz v7, :cond_3

    goto :goto_0

    :cond_3
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    const-string v1, "[\"\u201c\'\u300c]?([^\"\u201d\'\u300d\\n]{1,40}?)[\"\u201d\'\u300d]?\\s*\u64a4\u56de\u4e86"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-static {v1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4, p0}, LU/S;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, LW0/d;->a()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v5}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_6

    invoke-static {p0}, Lc0/o;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "sysmsg"

    invoke-static {p0, v1, v5}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_6

    return-object p0

    :cond_6
    :goto_2
    return-object v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ">\\s*<!\\[CDATA\\[(.*?)]]>\\s*</"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, LW0/h;->c:LW0/h;

    sget-object v4, LW0/h;->b:LW0/h;

    filled-new-array {v3, v4}, [LW0/h;

    move-result-object v5

    invoke-static {v5}, LA0/p;->W([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    const-string v6, "pattern"

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LW0/h;

    iget v9, v9, LW0/h;->a:I

    or-int/2addr v8, v9

    goto :goto_0

    :cond_0
    invoke-static {v8}, Lx0/e;->b(I)I

    move-result v5

    invoke-static {v0, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v5, "compile(...)"

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "input"

    invoke-static {p0, v8}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v8, "matcher(...)"

    invoke-static {v0, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v7, p0}, LU/S;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;

    move-result-object v0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LW0/d;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v9}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v10

    :goto_1
    if-eqz v0, :cond_3

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_2

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">(.*?)</"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v3, v4}, [LW0/h;

    move-result-object v0

    invoke-static {v0}, LA0/p;->W([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v1, v7

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LW0/h;

    iget v2, v2, LW0/h;->a:I

    or-int/2addr v1, v2

    goto :goto_3

    :cond_4
    invoke-static {v1}, Lx0/e;->b(I)I

    move-result v0

    invoke-static {p1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p1

    invoke-static {p1, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-static {p1, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v7, p0}, LU/S;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, LW0/d;->a()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v9}, LE0/l;->q0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_5

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {p0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/2addr p1, v9

    if-eqz p1, :cond_5

    move-object v10, p0

    :cond_5
    return-object v10
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "{name}\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    :cond_0
    const-string v0, "\u4f60"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lc0/o;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "\u5bf9\u65b9"

    :cond_2
    :goto_0
    invoke-static {p2}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const-string v1, ""

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_7

    invoke-static {p1}, Lc0/o;->k(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lc0/o;->l(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/16 v2, 0x30

    if-ge p2, v2, :cond_5

    goto :goto_1

    :cond_5
    const-string p2, "wxid_"

    const/4 v2, 0x1

    invoke-static {p1, p2, v2}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_1

    :cond_6
    const/16 p2, 0x50

    invoke-static {p1, p2}, LW0/j;->Z0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    :cond_7
    :goto_1
    const-string p1, "{name}"

    const/4 p2, 0x0

    invoke-static {p0, p1, v0, p2}, LW0/r;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string p1, "{content}"

    invoke-static {p0, p1, v1, p2}, LW0/r;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string p1, "${name}"

    invoke-static {p0, p1, v0, p2}, LW0/r;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string p1, "${content}"

    invoke-static {p0, p1, v1, p2}, LW0/r;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string p1, "[ \\t]{2,}"

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    const-string p2, "compile(...)"

    invoke-static {p1, p2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const-string p1, " "

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "replaceAll(...)"

    invoke-static {p0, p1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_8

    const-string p0, "\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_8
    invoke-static {p0}, Lc0/o;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "id"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "@chatroom"

    invoke-static {p0, v0}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "@im.chatroom"

    invoke-static {p0, v0}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 7

    const-string v0, "id"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x50

    if-le v0, v2, :cond_1

    :goto_0
    return v1

    :cond_1
    invoke-static {p0}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    move v0, v1

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_4

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, LU/S;->J(C)Z

    move-result v2

    if-eqz v2, :cond_3

    return v1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    const-string v0, "wxid_"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_5

    return v2

    :cond_5
    const-string v0, "@"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    return v2

    :cond_6
    const-string v0, "fmessage"

    const-string v3, "medianote"

    const-string v4, "filehelper"

    const-string v5, "newsapp"

    const-string v6, "weixin"

    filled-new-array {v4, v0, v3, v5, v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LA0/p;->W([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    return v2

    :cond_7
    const-string v0, "^[A-Za-z][A-Za-z0-9_-]{2,}$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v3, "compile(...)"

    invoke-static {v0, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    if-eqz p0, :cond_8

    return v2

    :cond_8
    return v1
.end method

.method public static i(Ljava/lang/String;)Z
    .locals 4

    sget-object v0, Lc0/o;->b:Ljava/util/List;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {p0, v1, v3}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    :cond_2
    :goto_0
    const-string v0, "you recalled a message"

    invoke-static {p0, v0, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    return p0
.end method

.method public static j(Ljava/lang/String;)Z
    .locals 6

    const-string v0, "text"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v0, "xwechat_files"

    const/4 v2, 0x1

    invoke-static {p0, v0, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    const-string v0, "RWTemp"

    invoke-static {p0, v0, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    const-string v0, "MicroMsg"

    invoke-static {p0, v0, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    const/16 v3, 0x2f

    const/16 v4, 0x5c

    if-eqz v0, :cond_4

    invoke-static {p0, v3}, LW0/j;->K0(Ljava/lang/CharSequence;C)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p0, v4}, LW0/j;->K0(Ljava/lang/CharSequence;C)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    return v2

    :cond_4
    const-string v0, "/storage/"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "/sdcard/"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "/data/"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "emulated"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const-string v0, "(?i)^[A-Z]:[/\\\\].*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v5, "compile(...)"

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_6

    return v2

    :cond_6
    invoke-static {p0, v4}, LW0/j;->K0(Ljava/lang/CharSequence;C)Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v0, 0x3a

    invoke-static {p0, v0}, LW0/j;->K0(Ljava/lang/CharSequence;C)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "WeChat"

    invoke-static {p0, v0, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_7
    return v2

    :cond_8
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "toLowerCase(...)"

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, ".jpg"

    invoke-static {v0, v5}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, ".png"

    invoke-static {v0, v5}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, ".jpeg"

    invoke-static {v0, v5}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, ".webp"

    invoke-static {v0, v5}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, ".gif"

    invoke-static {v0, v5}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, ".mp4"

    invoke-static {v0, v5}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, ".amr"

    invoke-static {v0, v5}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, ".silk"

    invoke-static {v0, v5}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, ".dat"

    invoke-static {v0, v5}, LW0/r;->C0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    invoke-static {p0, v3}, LW0/j;->K0(Ljava/lang/CharSequence;C)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-static {p0, v4}, LW0/j;->K0(Ljava/lang/CharSequence;C)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v0, 0x20

    if-lt p0, v0, :cond_a

    goto :goto_0

    :cond_a
    return v1

    :cond_b
    :goto_0
    return v2
.end method

.method public static k(Ljava/lang/String;)Z
    .locals 4

    if-eqz p0, :cond_0

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-static {p0}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    return v2

    :cond_3
    const-string v0, "<msg"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "<?xml"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "<img "

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    const-string v0, "cdnmidimgurl"

    invoke-static {p0, v0, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    return v2

    :cond_5
    const-string v0, "aeskey"

    invoke-static {p0, v0, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "length"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    return v2

    :cond_6
    const-string v0, "(?i)^[a-f0-9]{32,}(\\.[a-z0-9]+)?$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v3, "compile(...)"

    invoke-static {v0, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    if-eqz p0, :cond_7

    return v2

    :cond_7
    return v1

    :cond_8
    :goto_1
    return v2
.end method

.method public static l(Ljava/lang/String;)Z
    .locals 4

    sget-object v0, Lc0/o;->a:Ljava/util/List;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p0, v1, v2}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    return v3

    :cond_2
    :goto_0
    const-string v0, "recalled a message"

    invoke-static {p0, v0, v3}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    return v3

    :cond_3
    const-string v0, "revokemsg"

    invoke-static {p0, v0, v3}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    return v3

    :cond_4
    const-string v0, "<sysmsg"

    invoke-static {p0, v0, v3}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "revoke"

    invoke-static {p0, v0, v3}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    return v3

    :cond_5
    const-string v0, "MM_DATA_SYSCMD"

    invoke-static {p0, v0, v3}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "RECALL"

    invoke-static {p0, v0, v3}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-eqz p0, :cond_6

    return v3

    :cond_6
    return v2
.end method

.method public static m(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {p0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "\u5df2\u963b\u6b62\u64a4\u56de"

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lc0/o;->j(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p0}, Lc0/o;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "<"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_3
    :goto_0
    const-string p0, "[\u5df2\u963b\u6b62]"

    invoke-static {v2, p0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    return-object v2
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    const-string v0, "replacement"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    const-string p0, "\u4f60"

    return-object p0

    :cond_0
    invoke-static {p0}, Lc0/o;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    invoke-static {p1}, Lc0/o;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    invoke-static {p2}, Lc0/o;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    return-object p0

    :cond_3
    const-string p0, "\u5bf9\u65b9"

    return-object p0
.end method

.method public static o(ZLc0/e1;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    return-object v0

    :cond_0
    if-eqz p1, :cond_2

    iget-object p0, p1, Lc0/e1;->e:Ljava/lang/String;

    if-eqz p0, :cond_2

    invoke-static {p0}, Lc0/o;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    if-eqz p1, :cond_3

    iget-object p0, p1, Lc0/e1;->b:Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object p0, v0

    :goto_1
    invoke-static {p0}, Lc0/o;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    return-object p0

    :cond_4
    if-eqz p1, :cond_6

    iget-object p0, p1, Lc0/e1;->c:Ljava/lang/String;

    if-eqz p0, :cond_6

    invoke-static {p0}, Lc0/o;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {p0}, Lc0/o;->g(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    move-object p0, v0

    :goto_2
    if-eqz p0, :cond_6

    return-object p0

    :cond_6
    if-eqz p2, :cond_8

    invoke-static {p2}, Lc0/o;->h(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_7

    invoke-static {p2}, Lc0/o;->g(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_3

    :cond_7
    move-object p2, v0

    :goto_3
    if-eqz p2, :cond_8

    return-object p2

    :cond_8
    const-string p0, "session"

    invoke-static {p3, p0}, Lc0/o;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-static {p0}, Lc0/o;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {p0}, Lc0/o;->g(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_4

    :cond_9
    move-object p0, v0

    :goto_4
    if-eqz p0, :cond_a

    return-object p0

    :cond_a
    return-object v0
.end method
