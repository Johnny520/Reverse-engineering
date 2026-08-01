.class public final Lxhss/ᲀᛳᛲᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lxhss/ᛲᛵᲁᛲ;->ᛸᛲᲀᛵ:Lxhss/ᲀᛳᛲᛶ;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object v0, Lxhss/ᲀᛷᲇᛷ;->ᛸᛴᛶᛳ:Lxhss/ᲀᛳᛲᛶ;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Lxhss/ᛵᛸᛱ;

    invoke-direct {v0, p0}, Lxhss/ᛵᛸᛱ;-><init>(Lxhss/ᲀᛳᛲᛶ;)V

    iput-object v0, p0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x23

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lxhss/ᛴᛸᛴᲈ;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Lxhss/ᛴᛸᛴᲈ;-><init>(Lxhss/ᲀᛳᛲᛶ;Landroid/view/WindowInsets;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/16 v1, 0x22

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    new-instance v0, Lxhss/ᛲᛵᲁᛲ;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lxhss/ᛲᛵᲁᛲ;-><init>(Lxhss/ᲀᛳᛲᛶ;Landroid/view/WindowInsets;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const/16 v1, 0x1f

    .line 31
    .line 32
    if-lt v0, v1, :cond_2

    .line 33
    .line 34
    new-instance v0, Lxhss/ᛶᛳᛶᛳ;

    .line 35
    .line 36
    invoke-direct {v0, p0, p1}, Lxhss/ᛶᛳᛶᛳ;-><init>(Lxhss/ᲀᛳᛲᛶ;Landroid/view/WindowInsets;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    new-instance v0, Lxhss/ᲀᛷᲇᛷ;

    .line 43
    .line 44
    invoke-direct {v0, p0, p1}, Lxhss/ᲀᛷᲇᛷ;-><init>(Lxhss/ᲀᛳᛲᛶ;Landroid/view/WindowInsets;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 48
    .line 49
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲀᛳᛲᛶ;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1}, Lxhss/ᲀᛳᛲᛶ;-><init>(Landroid/view/WindowInsets;)V

    .line 7
    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    sget p1, Lxhss/ᛷᛱᛴᛴ;->ᛷᛵᛵᲈ:I

    .line 18
    .line 19
    invoke-static {p0}, Lxhss/ᲁᲁᛷ;->ᛷᛵᛵᲈ(Landroid/view/View;)Lxhss/ᲀᛳᛲᛶ;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, v0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Lxhss/ᛵᛸᛱ;->ᛸᛲᛷᛱ(Lxhss/ᲀᛳᛲᛶ;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v1, p1}, Lxhss/ᛵᛸᛱ;->ᲇᛴᲇᛵ(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Lxhss/ᛵᛸᛱ;->ᲈᛳᲀ(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lxhss/ᛵᛸᛱ;->ᛷᲁᲁ()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {v1, p0}, Lxhss/ᛵᛸᛱ;->ᛴᲈᛱᛴ(I)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lxhss/ᲀᛳᛲᛶ;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lxhss/ᲀᛳᛲᛶ;

    .line 12
    .line 13
    iget-object p0, p0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 14
    .line 15
    iget-object p1, p1, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 16
    .line 17
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛵᛸᛱ;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final ᛷᛵᛵᲈ()Landroid/view/WindowInsets;
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 2
    .line 3
    instance-of v0, p0, Lxhss/ᛲᛱᛱᛵ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lxhss/ᛲᛱᛱᛵ;

    .line 8
    .line 9
    iget-object p0, p0, Lxhss/ᛲᛱᛱᛵ;->ᛱᛱᛲᲇ:Landroid/view/WindowInsets;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method
