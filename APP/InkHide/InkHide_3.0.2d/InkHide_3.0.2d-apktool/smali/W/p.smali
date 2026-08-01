.class public final LW/p;
.super LW/o;
.source "SourceFile"


# instance fields
.field public final b:LV/p;


# direct methods
.method public constructor <init>(LV/p;Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, LW/o;-><init>(Ljava/util/LinkedHashMap;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW/p;->b:LV/p;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LW/p;->b:LV/p;

    .line 2
    .line 3
    invoke-interface {v0}, LV/p;->n()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final e(Ljava/lang/Object;Lb0/b;LW/n;)V
    .locals 1

    .line 1
    iget-object v0, p3, LW/n;->h:LT/y;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, LT/y;->a(Lb0/b;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-nez p2, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p3, LW/n;->k:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    :goto_0
    iget-object v0, p3, LW/n;->b:Ljava/lang/reflect/Field;

    .line 16
    .line 17
    iget-boolean p3, p3, LW/n;->l:Z

    .line 18
    .line 19
    if-nez p3, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    const/4 p1, 0x0

    .line 26
    invoke-static {v0, p1}, LY/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance p2, LT/p;

    .line 31
    .line 32
    const-string p3, "Cannot set value of \'static final\' "

    .line 33
    .line 34
    invoke-static {p3, p1}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p2
.end method
