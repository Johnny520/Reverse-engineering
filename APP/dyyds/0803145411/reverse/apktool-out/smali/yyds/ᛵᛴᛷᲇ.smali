.class public final Lyyds/ᛵᛴᛷᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛷᛷ;


# static fields
.field public static final ᛵᛸᛸᛷ:Ljava/util/Set;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛵᲀᛷᛵ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v1, "content"

    .line 4
    .line 5
    const-string v2, "android.resource"

    .line 6
    .line 7
    const-string v3, "file"

    .line 8
    .line 9
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lyyds/ᛵᛴᛷᲇ;->ᛵᛸᛸᛷ:Ljava/util/Set;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lyyds/ᛵᲀᛷᛵ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛵᛴᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛵᲀᛷᛵ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛵᲁᛴᛱ;
    .locals 2

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    new-instance p2, Lyyds/ᛵᲁᛴᛱ;

    .line 4
    .line 5
    new-instance p3, Lyyds/ᛸᛷᛴᲁ;

    .line 6
    .line 7
    invoke-direct {p3, p1}, Lyyds/ᛸᛷᛴᲁ;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛵᛴᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛵᲀᛷᛵ;

    .line 11
    .line 12
    iget p4, p0, Lyyds/ᛵᲀᛷᛵ;->ᲀᛲᛳᲀ:I

    .line 13
    .line 14
    packed-switch p4, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p4, Lyyds/ᛱᛱᛵᛱ;

    .line 18
    .line 19
    iget-object v0, p0, Lyyds/ᛵᲀᛷᛵ;->ᲇᲈᛵᛷ:Landroid/content/ContentResolver;

    .line 20
    .line 21
    iget-boolean p0, p0, Lyyds/ᛵᲀᛷᛵ;->ᛲᛴᛳᛲ:Z

    .line 22
    .line 23
    invoke-direct {p4, v0, p1, p0}, Lyyds/ᛱᛴᲁᛵ;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Z)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_0
    new-instance p4, Lyyds/ᲁᛷᲁ;

    .line 28
    .line 29
    iget-object v0, p0, Lyyds/ᛵᲀᛷᛵ;->ᲇᲈᛵᛷ:Landroid/content/ContentResolver;

    .line 30
    .line 31
    iget-boolean p0, p0, Lyyds/ᛵᲀᛷᛵ;->ᛲᛴᛳᛲ:Z

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {p4, v0, p1, p0, v1}, Lyyds/ᲁᛷᲁ;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;ZI)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_1
    new-instance p4, Lyyds/ᲁᛷᲁ;

    .line 39
    .line 40
    iget-object v0, p0, Lyyds/ᛵᲀᛷᛵ;->ᲇᲈᛵᛷ:Landroid/content/ContentResolver;

    .line 41
    .line 42
    iget-boolean p0, p0, Lyyds/ᛵᲀᛷᛵ;->ᛲᛴᛳᛲ:Z

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {p4, v0, p1, p0, v1}, Lyyds/ᲁᛷᲁ;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;ZI)V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-direct {p2, p3, p4}, Lyyds/ᛵᲁᛴᛱ;-><init>(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᛳᲇᛶᲀ;)V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    sget-object p0, Lyyds/ᛵᛴᛷᲇ;->ᛵᛸᛸᛷ:Ljava/util/Set;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
