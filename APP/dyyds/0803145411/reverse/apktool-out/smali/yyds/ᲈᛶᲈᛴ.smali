.class public final Lyyds/ᲈᛶᲈᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:Lyyds/ᲈᛶᲈᛴ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;


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
    sget-object v0, Lyyds/ᛶᛷᲇᛸ;->ᛷᲈᲈᲁ:Lyyds/ᲈᛶᲈᛴ;

    .line 8
    .line 9
    sput-object v0, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛶᲈᛴ;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v0, Lyyds/ᲇᛱᲇᛲ;->ᛲᛳᛶᲁ:Lyyds/ᲈᛶᲈᛴ;

    .line 13
    .line 14
    sput-object v0, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛶᲈᛴ;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Lyyds/ᲈᛲᲁᛳ;

    invoke-direct {v0, p0}, Lyyds/ᲈᛲᲁᛳ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    iput-object v0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

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
    new-instance v0, Lyyds/ᛲᛶᛲ;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Lyyds/ᛲᛶᛲ;-><init>(Lyyds/ᲈᛶᲈᛴ;Landroid/view/WindowInsets;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

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
    new-instance v0, Lyyds/ᛶᛷᲇᛸ;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lyyds/ᛶᛷᲇᛸ;-><init>(Lyyds/ᲈᛶᲈᛴ;Landroid/view/WindowInsets;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

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
    new-instance v0, Lyyds/ᛴᛱᲀᛵ;

    .line 35
    .line 36
    invoke-direct {v0, p0, p1}, Lyyds/ᛴᛱᲀᛵ;-><init>(Lyyds/ᲈᛶᲈᛴ;Landroid/view/WindowInsets;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    new-instance v0, Lyyds/ᲇᛱᲇᛲ;

    .line 43
    .line 44
    invoke-direct {v0, p0, p1}, Lyyds/ᲇᛱᲇᛲ;-><init>(Lyyds/ᲈᛶᲈᛴ;Landroid/view/WindowInsets;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 48
    .line 49
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Landroid/view/View;Landroid/view/WindowInsets;)Lyyds/ᲈᛶᲈᛴ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲈᛶᲈᛴ;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1}, Lyyds/ᲈᛶᲈᛴ;-><init>(Landroid/view/WindowInsets;)V

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
    sget-object p1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-static {p0}, Lyyds/ᛸᛸᲈᛵ;->ᛲᲈᲁ(Landroid/view/View;)Lyyds/ᲈᛶᲈᛴ;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, v0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Lyyds/ᲈᛲᲁᛳ;->ᲀᛲᛲᲇ(Lyyds/ᲈᛶᲈᛴ;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v1, p1}, Lyyds/ᲈᛲᲁᛳ;->ᲇᲈᛵᛷ(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Lyyds/ᲈᛲᲁᛳ;->ᛷᛲᲈᛱ(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lyyds/ᲈᛲᲁᛳ;->ᛷᛵᲇᲀ()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {v1, p0}, Lyyds/ᲈᛲᲁᛳ;->ᛳᛸᛴᛶ(I)V

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
    instance-of v0, p1, Lyyds/ᲈᛶᲈᛴ;

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
    check-cast p1, Lyyds/ᲈᛶᲈᛴ;

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 14
    .line 15
    iget-object p1, p1, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

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
    iget-object p0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

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
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final ᛲᲈᲁ()Landroid/view/WindowInsets;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 2
    .line 3
    instance-of v0, p0, Lyyds/ᲇᛸᛷᛳ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lyyds/ᲇᛸᛷᛳ;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method
