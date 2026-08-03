.class public final Lg8/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lg8/a;

.field public final b:Lg8/i;


# direct methods
.method public constructor <init>(Lg8/a;Lg8/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg8/k;->a:Lg8/a;

    .line 5
    .line 6
    iput-object p2, p0, Lg8/k;->b:Lg8/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lg8/k;->b:Lg8/i;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    if-eqz p1, :cond_2

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_2
    :goto_0
    const-string p1, ""

    .line 27
    .line 28
    return-object p1
.end method
