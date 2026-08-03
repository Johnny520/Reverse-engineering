.class public final Ll8/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Landroid/content/ContentValues;

.field public final e:Ljava/lang/String;

.field public final f:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll8/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ll8/a;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p6, p0, Ll8/a;->c:J

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    new-instance p2, Landroid/content/ContentValues;

    .line 14
    .line 15
    invoke-direct {p2, p3}, Landroid/content/ContentValues;-><init>(Landroid/content/ContentValues;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p2, p1

    .line 20
    :goto_0
    iput-object p2, p0, Ll8/a;->d:Landroid/content/ContentValues;

    .line 21
    .line 22
    iput-object p4, p0, Ll8/a;->e:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz p5, :cond_1

    .line 25
    .line 26
    invoke-virtual {p5}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, [Ljava/lang/String;

    .line 31
    .line 32
    :cond_1
    iput-object p1, p0, Ll8/a;->f:[Ljava/lang/String;

    .line 33
    .line 34
    return-void
.end method
