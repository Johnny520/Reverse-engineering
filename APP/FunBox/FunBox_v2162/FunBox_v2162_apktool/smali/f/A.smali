.class public final Lf/A;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/A;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/A;

    invoke-direct {v0}, Lf/A;-><init>()V

    sput-object v0, Lf/A;->a:Lf/A;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupported"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(Le/j;)Ljava/lang/String;
    .locals 1

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Le/j;)Ljava/lang/String;
    .locals 1

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Le/j;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "unsupported"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
