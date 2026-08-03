.class public final Lc5/e;
.super Lc5/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILx5/f;)V
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    invoke-direct {p0, p1, v0}, Lc5/b;-><init>(II)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p2, Lx5/f;->h:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p1, p0, Lc5/e;->i:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(Le5/a;)Z
    .locals 2

    .line 1
    const-string v0, ".source"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5/e;->i:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v1, " "

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Lq5/a;->write(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lq5/a;->m(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    return p1
.end method
