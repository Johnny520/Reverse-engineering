.class public final Lq4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Landroid/text/SpannableStringBuilder;


# direct methods
.method public constructor <init>(IILandroid/text/SpannableStringBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lq4;->a:I

    .line 5
    .line 6
    iput p2, p0, Lq4;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lq4;->c:Landroid/text/SpannableStringBuilder;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lq4;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    iget p0, p0, Lq4;->a:I

    .line 8
    .line 9
    iget p1, p1, Lq4;->a:I

    .line 10
    .line 11
    sub-int/2addr p0, p1

    .line 12
    return p0
.end method
