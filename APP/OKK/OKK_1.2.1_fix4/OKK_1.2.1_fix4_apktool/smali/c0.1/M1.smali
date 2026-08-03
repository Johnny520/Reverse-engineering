.class public final Lc0/M1;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(ZLjava/lang/reflect/Method;)V
    .locals 0

    iput-boolean p1, p0, Lc0/M1;->b:Z

    iput-object p2, p0, Lc0/M1;->c:Ljava/lang/reflect/Method;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lde/robv/android/xposed/b;)V
    .locals 6

    sget-object v0, Lc0/L1;->a:Lc0/L1;

    invoke-static {v0}, Lc0/L1;->e(Lc0/L1;)LD0/i;

    move-result-object v1

    iget-object v1, v1, LD0/i;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lc0/L1;->e(Lc0/L1;)LD0/i;

    move-result-object v0

    iget-object v1, v0, LD0/i;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, v0, LD0/i;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    iget-object v0, v0, LD0/i;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-boolean v0, p0, Lc0/M1;->b:Z

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move-wide v2, v4

    :goto_0
    iget-object v0, p0, Lc0/M1;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-class v1, Ljava/lang/Float;

    invoke-static {v0, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_2

    :cond_4
    :goto_1
    double-to-float v0, v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    return-void
.end method
