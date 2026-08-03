.class public final Lg/a;
.super Lg/C;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lg/C;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->q:Lg/t;

    return-object v0
.end method

.method public final e(Lg/C;)I
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "uninternable instance"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected final j(Lg/E;I)V
    .locals 0

    const/16 p1, 0x10

    invoke-virtual {p0, p1}, Lg/C;->k(I)V

    return-void
.end method

.method protected final l(Lg/k;Ln/d;)V
    .locals 3

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lg/C;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " annotations directory"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "  class_annotations_off: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x4

    invoke-virtual {p2, v1, p1}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "  fields_size:           "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "  methods_size:          "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "  parameters_size:       "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Ln/d;->b(ILjava/lang/String;)V

    :cond_0
    invoke-virtual {p2, v0}, Ln/d;->q(I)V

    invoke-virtual {p2, v0}, Ln/d;->q(I)V

    invoke-virtual {p2, v0}, Ln/d;->q(I)V

    invoke-virtual {p2, v0}, Ln/d;->q(I)V

    return-void
.end method
