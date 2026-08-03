.class public final Lic/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lhc/a;


# instance fields
.field public final g:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lic/a;->g:I

    .line 5
    .line 6
    return-void
.end method

.method public static a(Lfc/f;Lud/p;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p0, Lfc/b;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget p1, p1, Lud/p;->n:I

    .line 12
    .line 13
    if-gez p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    new-instance v0, Lic/a;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lic/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    move-object p1, v0

    .line 23
    :goto_0
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lfc/f;->l(Lic/a;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final j()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lic/a;->g:I

    .line 2
    .line 3
    const-string v1, "offset="

    .line 4
    .line 5
    invoke-static {v0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
