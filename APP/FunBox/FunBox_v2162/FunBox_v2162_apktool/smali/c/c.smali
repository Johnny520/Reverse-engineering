.class final Lc/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lc/i;

.field private final b:I

.field private final c:Lc/a;


# direct methods
.method public constructor <init>(Lc/i;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/c;->a:Lc/i;

    iput p2, p0, Lc/c;->b:I

    new-instance p1, Lc/a;

    invoke-direct {p1, p0}, Lc/a;-><init>(Lc/c;)V

    iput-object p1, p0, Lc/c;->c:Lc/a;

    return-void
.end method

.method static bridge synthetic a(Lc/c;)Lc/a;
    .locals 0

    iget-object p0, p0, Lc/c;->c:Lc/a;

    return-object p0
.end method


# virtual methods
.method final b()Z
    .locals 2

    iget v0, p0, Lc/c;->b:I

    const v1, 0x1000a

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method final c()Z
    .locals 1

    iget v0, p0, Lc/c;->b:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method final d(Ld/a;)Lg/n;
    .locals 5

    iget v0, p0, Lc/c;->b:I

    and-int/lit16 v1, v0, 0x400

    iget-object v2, p0, Lc/c;->a:Lc/i;

    if-nez v1, :cond_1

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lh/b;

    iget-object v3, p0, Lc/c;->c:Lc/a;

    invoke-virtual {v3}, Lc/a;->r()Lj/c;

    move-result-object v4

    invoke-direct {v1, v4}, Lh/b;-><init>(Lj/c;)V

    invoke-virtual {v3}, Lc/a;->o()I

    move-result v3

    invoke-static {v1, v3, p1}, Le/D;->i(Lh/b;ILd/a;)Le/i;

    move-result-object p1

    new-instance v1, Lg/n;

    iget-object v2, v2, Lc/i;->e:Lk/q;

    sget-object v3, Ll/b;->c:Ll/b;

    invoke-direct {v1, v2, v0, p1, v3}, Lg/n;-><init>(Lk/q;ILe/i;Ll/b;)V

    return-object v1

    :cond_1
    :goto_0
    new-instance p1, Lg/n;

    iget-object v1, v2, Lc/i;->e:Lk/q;

    sget-object v2, Ll/b;->c:Ll/b;

    const/4 v3, 0x0

    invoke-direct {p1, v1, v0, v3, v2}, Lg/n;-><init>(Lk/q;ILe/i;Ll/b;)V

    return-object p1
.end method
