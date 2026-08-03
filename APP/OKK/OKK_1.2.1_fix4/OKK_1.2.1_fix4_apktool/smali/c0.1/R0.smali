.class public final Lc0/R0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/R0;

.field public static final b:LW0/g;

.field public static final c:LW0/g;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc0/R0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc0/R0;->a:Lc0/R0;

    new-instance v0, LW0/g;

    const-string v1, ".*\\d+(?:\\.\\d+)?\\s*(?:B|KB|MB|GB|TB).*"

    invoke-direct {v0, v1}, LW0/g;-><init>(Ljava/lang/String;)V

    sput-object v0, Lc0/R0;->b:LW0/g;

    new-instance v0, LW0/g;

    const-string v1, ".*\\.(?:docx?|xlsx?|pptx?|pdf|zip|rar|7z|txt|apk|jpg|jpeg|png|gif|mp4|mp3|m4a|wav)(?:\\s|$).*"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LW0/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc0/R0;->c:LW0/g;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lc0/R0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lc0/R0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    instance-of v0, p0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "getChildAt(...)"

    invoke-static {v2, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p1}, Lc0/R0;->a(Landroid/view/View;Ljava/util/ArrayList;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

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

.method public static c(Ljava/lang/String;)Z
    .locals 3

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

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lc0/R0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    return v1

    :cond_3
    const-string v0, "wxid_"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x6

    if-gt v2, v0, :cond_5

    const/16 v2, 0x51

    if-ge v0, v2, :cond_5

    const-string v0, "[a-zA-Z][\\w@.\\-]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v2, "compile(...)"

    invoke-static {v0, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    if-eqz p0, :cond_5

    :cond_4
    const/4 v1, 0x1

    :cond_5
    return v1
.end method

.method public static varargs e(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_b

    aget-object v3, p1, v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    new-instance v5, Lc0/P0;

    invoke-direct {v5, v4, v2}, Lc0/P0;-><init>(Ljava/lang/Class;LH0/a;)V

    invoke-static {v5}, LU/S;->K(LP0/p;)LV0/i;

    move-result-object v4

    :cond_0
    invoke-virtual {v4}, LV0/i;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, LV0/i;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/reflect/Method;

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    const-string v8, "getParameterTypes(...)"

    invoke-static {v7, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v7

    if-nez v7, :cond_0

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ljava/lang/String;

    invoke-static {v6, v7}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    check-cast v5, Ljava/lang/reflect/Method;

    const/4 v4, 0x1

    if-eqz v5, :cond_5

    :try_start_0
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/String;

    if-eqz v6, :cond_2

    check-cast v5, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v5

    goto :goto_2

    :cond_2
    move-object v5, v2

    goto :goto_3

    :goto_2
    invoke-static {v5}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v5

    :goto_3
    instance-of v6, v5, LD0/f;

    if-eqz v6, :cond_3

    move-object v5, v2

    :cond_3
    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_5

    invoke-static {v5}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v6

    xor-int/2addr v6, v4

    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    move-object v5, v2

    :goto_4
    if-eqz v5, :cond_5

    return-object v5

    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    :goto_5
    if-eqz v5, :cond_a

    const-class v6, Ljava/lang/Object;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :try_start_1
    invoke-virtual {v5, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_6

    check-cast v6, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v6

    goto :goto_6

    :cond_6
    move-object v6, v2

    goto :goto_7

    :goto_6
    invoke-static {v6}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v6

    :goto_7
    instance-of v7, v6, LD0/f;

    if-eqz v7, :cond_7

    move-object v6, v2

    :cond_7
    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_9

    invoke-static {v6}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v7

    xor-int/2addr v7, v4

    if-eqz v7, :cond_8

    goto :goto_8

    :cond_8
    move-object v6, v2

    :goto_8
    if-eqz v6, :cond_9

    return-object v6

    :cond_9
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v5

    goto :goto_5

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_b
    return-object v2
.end method

.method public static f(Ljava/lang/Object;)Lc0/O0;
    .locals 9

    const-string v0, "talker"

    const-string v1, "getTalker"

    const-string v2, "field_talker"

    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lc0/R0;->e(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    invoke-static {v0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_9

    :cond_0
    invoke-static {v0}, Lc0/R0;->b(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_3

    invoke-static {v0}, Lc0/R0;->c(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    move-object p0, v0

    goto :goto_0

    :cond_1
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_2

    new-instance v1, Lc0/O0;

    invoke-direct {v1, v0, v0, v3}, Lc0/O0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_2
    return-object v1

    :cond_3
    sget-object v2, Lc0/R0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    new-instance v5, Lc0/A;

    const/16 v6, 0xa

    invoke-direct {v5, v6}, Lc0/A;-><init>(I)V

    new-instance v6, Lc0/O;

    const/4 v7, 0x5

    invoke-direct {v6, v5, v7}, Lc0/O;-><init>(LP0/l;I)V

    invoke-virtual {v2, v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_4

    :try_start_0
    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :cond_4
    move-object v2, v1

    :goto_1
    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_5

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_5
    move-object v2, v1

    goto :goto_3

    :goto_2
    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v2

    :goto_3
    instance-of v4, v2, LD0/f;

    if-eqz v4, :cond_6

    move-object v2, v1

    :cond_6
    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lc0/R0;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {v2}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-static {v2}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_7
    const-string v2, "field_sendTalker"

    const-string v4, "sender"

    const-string v5, "getSender"

    const-string v6, "field_sender"

    filled-new-array {v5, v6, v2, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lc0/R0;->e(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-static {v2}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-static {v2}, Lc0/R0;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    move-object v2, v1

    :goto_4
    const/4 v4, 0x1

    if-nez v2, :cond_f

    const-string v2, "content"

    const-string v5, "getContent"

    const-string v6, "field_content"

    filled-new-array {v5, v6, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lc0/R0;->e(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_9

    const-string p0, ""

    :cond_9
    const-string v2, ":\r\n"

    const-string v5, ":\n"

    filled-new-array {v2, v5}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/4 v7, 0x6

    invoke-static {p0, v6, v3, v3, v7}, LW0/j;->P0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_b
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    if-gt v4, v7, :cond_b

    const/16 v8, 0x51

    if-ge v7, v8, :cond_b

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    invoke-static {v2}, LE0/l;->s0(Ljava/util/ArrayList;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v2, "substring(...)"

    invoke-static {p0, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lc0/R0;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_7

    :cond_d
    move-object p0, v1

    :goto_7
    move-object v2, p0

    goto :goto_8

    :cond_e
    move-object v2, v1

    :goto_8
    if-nez v2, :cond_f

    return-object v1

    :cond_f
    invoke-static {v2}, Lc0/R0;->b(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_10

    return-object v1

    :cond_10
    new-instance p0, Lc0/O0;

    invoke-direct {p0, v0, v2, v4}, Lc0/O0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object p0

    :cond_11
    :goto_9
    return-object v1
.end method


# virtual methods
.method public final d(Landroid/view/View;Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 15

    move-object/from16 v0, p2

    new-instance v1, LF0/c;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, LF0/c;-><init>(I)V

    invoke-virtual {v1, v0}, LF0/c;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, LF0/c;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_5

    const-class v5, Ljava/lang/Object;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v5

    invoke-static {v5}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v5

    :cond_1
    :goto_1
    invoke-virtual {v5}, LE0/c;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/reflect/Field;

    const-class v7, Landroid/view/View;

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v6, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Landroid/view/View;

    if-eqz v7, :cond_2

    check-cast v6, Landroid/view/View;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    move-object v6, v3

    :goto_2
    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v1, v6}, LF0/c;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_3
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_5
    invoke-static {v1}, LA0/p;->f(LF0/c;)LF0/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LF0/c;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v4

    :cond_6
    :goto_4
    move-object v0, v4

    check-cast v0, LF0/a;

    invoke-virtual {v0}, LF0/a;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v0}, LF0/a;->next()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, Lc0/R0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    new-instance v14, Lc0/Q0;

    const-class v10, Lc0/R0;

    const-string v11, "findNicknameField"

    const/4 v8, 0x1

    const-string v12, "findNicknameField(Ljava/lang/Class;)Ljava/lang/reflect/Field;"

    const/4 v13, 0x1

    move-object v7, v14

    move-object v9, p0

    invoke-direct/range {v7 .. v13}, Lc0/Q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v7, Lc0/O;

    const/4 v8, 0x6

    invoke-direct {v7, v14, v8}, Lc0/O;-><init>(LP0/l;I)V

    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/reflect/Field;

    if-nez v5, :cond_7

    goto :goto_4

    :cond_7
    :try_start_1
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v5, v0, Landroid/widget/TextView;

    if-eqz v5, :cond_8

    check-cast v0, Landroid/widget/TextView;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_8
    move-object v0, v3

    goto :goto_6

    :goto_5
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_6
    instance-of v5, v0, LD0/f;

    if-eqz v5, :cond_9

    move-object v0, v3

    :cond_9
    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_6

    return-object v0

    :cond_a
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v4, p1

    invoke-static {v4, v0}, Lc0/R0;->a(Landroid/view/View;Ljava/util/ArrayList;)V

    new-instance v4, LE0/k;

    const/4 v5, 0x2

    invoke-direct {v4, v5, v0}, LE0/k;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lc0/Q0;

    const-class v9, Lc0/R0;

    const-string v10, "isLikelyNickname"

    const/4 v7, 0x1

    const-string v11, "isLikelyNickname(Landroid/widget/TextView;)Z"

    const/4 v12, 0x0

    move-object v6, v0

    move-object v8, p0

    invoke-direct/range {v6 .. v12}, Lc0/Q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v5, LV0/e;

    invoke-direct {v5, v4, v2, v0}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v0, Lc0/A;

    const/16 v4, 0xb

    invoke-direct {v0, v4}, Lc0/A;-><init>(I)V

    new-instance v4, LV0/e;

    invoke-direct {v4, v5, v1, v0}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v0, Lc0/A;

    const/16 v5, 0xc

    invoke-direct {v0, v5}, Lc0/A;-><init>(I)V

    new-instance v5, LV0/e;

    invoke-direct {v5, v4, v1, v0}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v0, Lc0/A;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lc0/A;-><init>(I)V

    new-instance v1, LV0/e;

    invoke-direct {v1, v5, v2, v0}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v0, LV0/d;

    invoke-direct {v0, v1}, LV0/d;-><init>(LV0/e;)V

    invoke-virtual {v0}, LV0/d;->hasNext()Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v0}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, LV0/d;->hasNext()Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_7

    :cond_c
    move-object v1, v3

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    :cond_d
    invoke-virtual {v0}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    if-le v1, v4, :cond_e

    move-object v3, v2

    move v1, v4

    :cond_e
    invoke-virtual {v0}, LV0/d;->hasNext()Z

    move-result v2

    if-nez v2, :cond_d

    :goto_7
    check-cast v3, Landroid/widget/TextView;

    return-object v3
.end method
