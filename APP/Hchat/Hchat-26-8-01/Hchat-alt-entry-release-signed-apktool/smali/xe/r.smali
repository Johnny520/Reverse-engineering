.class public final Lxe/r;
.super Ljava/io/OutputStream;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:Lfc/f;


# direct methods
.method public constructor <init>(Lfc/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxe/r;->g:Lfc/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 2

    .line 1
    int-to-char p1, p1

    .line 2
    const/16 v0, 0xa

    .line 3
    .line 4
    iget-object v1, p0, Lxe/r;->g:Lfc/f;

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/16 v0, 0xd

    .line 9
    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lfc/f;->d(C)Lfc/f;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :cond_1
    invoke-virtual {v1}, Lfc/f;->p()V

    .line 17
    .line 18
    .line 19
    return-void
.end method
