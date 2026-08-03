.class public final Ld3/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ld3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/util/Locale;

    .line 3
    .line 4
    new-instance v1, Landroid/os/LocaleList;

    .line 5
    .line 6
    invoke-direct {v1, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ld3/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld3/a;->a:Ld3/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ld3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ld3/a;

    .line 6
    .line 7
    iget-object p1, p1, Ld3/a;->a:Ld3/b;

    .line 8
    .line 9
    iget-object v0, p0, Ld3/a;->a:Ld3/b;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ld3/b;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/a;->a:Ld3/b;

    .line 2
    .line 3
    iget-object v0, v0, Ld3/b;->a:Landroid/os/LocaleList;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/LocaleList;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ld3/a;->a:Ld3/b;

    .line 2
    .line 3
    iget-object v0, v0, Ld3/b;->a:Landroid/os/LocaleList;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/LocaleList;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
