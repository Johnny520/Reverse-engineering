.class public abstract Lj/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll/b;

.field public static final b:Ll/b;

.field public static final c:Ll/b;

.field public static final d:Ll/b;

.field public static final e:Ll/b;

.field public static final f:Ll/b;

.field public static final g:Ll/b;

.field public static final h:Ll/b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-string v0, "Ljava/lang/ArithmeticException;"

    invoke-static {v0}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v0

    const-string v1, "Ljava/lang/ArrayIndexOutOfBoundsException;"

    invoke-static {v1}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v1

    const-string v2, "Ljava/lang/ArrayStoreException;"

    invoke-static {v2}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v2

    const-string v3, "Ljava/lang/ClassCastException;"

    invoke-static {v3}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v3

    const-string v4, "Ljava/lang/Error;"

    invoke-static {v4}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v4

    const-string v5, "Ljava/lang/IllegalMonitorStateException;"

    invoke-static {v5}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v5

    const-string v6, "Ljava/lang/NegativeArraySizeException;"

    invoke-static {v6}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v6

    const-string v7, "Ljava/lang/NullPointerException;"

    invoke-static {v7}, Ll/c;->i(Ljava/lang/String;)Ll/c;

    move-result-object v7

    invoke-static {v4}, Ll/b;->F(Ll/c;)Ll/b;

    move-result-object v8

    sput-object v8, Lj/e;->a:Ll/b;

    invoke-static {v4, v0}, Ll/b;->G(Ll/c;Ll/c;)Ll/b;

    move-result-object v0

    sput-object v0, Lj/e;->b:Ll/b;

    invoke-static {v4, v3}, Ll/b;->G(Ll/c;Ll/c;)Ll/b;

    move-result-object v0

    sput-object v0, Lj/e;->c:Ll/b;

    invoke-static {v4, v6}, Ll/b;->G(Ll/c;Ll/c;)Ll/b;

    move-result-object v0

    sput-object v0, Lj/e;->d:Ll/b;

    invoke-static {v4, v7}, Ll/b;->G(Ll/c;Ll/c;)Ll/b;

    move-result-object v0

    sput-object v0, Lj/e;->e:Ll/b;

    invoke-static {v4, v7, v1}, Ll/b;->H(Ll/c;Ll/c;Ll/c;)Ll/b;

    move-result-object v0

    sput-object v0, Lj/e;->f:Ll/b;

    invoke-static {v4, v7, v1, v2}, Ll/b;->I(Ll/c;Ll/c;Ll/c;Ll/c;)Ll/b;

    move-result-object v0

    sput-object v0, Lj/e;->g:Ll/b;

    invoke-static {v4, v7, v5}, Ll/b;->H(Ll/c;Ll/c;Ll/c;)Ll/b;

    move-result-object v0

    sput-object v0, Lj/e;->h:Ll/b;

    return-void
.end method
