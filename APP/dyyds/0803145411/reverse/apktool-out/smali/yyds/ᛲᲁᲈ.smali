.class public final Lyyds/ᛲᲁᲈ;
.super Ljava/lang/Object;

# interfaces
.implements Lyyds/ᲁᛸᛲᲁ;
.implements Lyyds/ᲇᛲᛸᛶ;
.implements Lyyds/ᲈᛵᛴᲀ;
.implements Lyyds/ᛸᛷᲀᛵ;
.implements Lyyds/ᲇᛸᛸᲀ;
.implements Lyyds/ᛶᲀᲁᛲ;
.implements Lyyds/ᛳᲇᛶᛷ;
.implements Lyyds/ᛴᲁᲇ;
.implements Lyyds/ᛳᛲᛴᛳ;
.implements Lyyds/ᛶᲁᛸᛷ;
.implements Lyyds/ᛲᛷᛵᲈ;
.implements Lyyds/ᲈᲁᛸᲀ;


# static fields
.field public static volatile ᛱᲈᲁ:Lyyds/ᛲᲁᲈ;

.field public static final ᛲᛴᛳᛲ:Lyyds/ᛲᲁᲈ;

.field public static final ᛶᛷᛲᲁ:Lyyds/ᛲᲁᲈ;

.field public static final synthetic ᲇᲇᲇᛱ:Lyyds/ᛲᲁᲈ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᛲᲁᲈ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xe0

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    .line 1
    new-instance v0, Lyyds/ᛲᲁᲈ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᲈ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛲᲁᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛲᲁᲈ;

    .line 8
    .line 9
    new-instance v0, Lyyds/ᛲᲁᲈ;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᲈ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyyds/ᛲᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᲈ;

    .line 16
    .line 17
    new-instance v0, Lyyds/ᛲᲁᲈ;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᲈ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lyyds/ᛲᲁᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲁᲈ;

    .line 24
    .line 25
    new-instance v0, Lyyds/ᛲᲁᲈ;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᲈ;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lyyds/ᛲᲁᲈ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲁᲈ;

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛲᲁᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static native ᛱᛳᛶᛳ(Landroid/content/Context;)V
.end method

.method public static native ᛱᛳᲇ(ILjava/lang/String;)Ljava/lang/String;
.end method

.method public static native ᛲᛳᛴᛸ(Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;)Ljava/lang/String;
.end method

.method public static native ᛳᛸᛴᛶ(Lyyds/ᛲᲁᲈ;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public static native ᛵᛶᛲᲀ(Landroid/content/Context;)Lcom/ss/android/ugc/awemes/WardDatabase;
.end method

.method public static native ᛵᲀᛵᛸ(Ljava/lang/String;)J
.end method

.method public static synthetic ᛵᲀᲈᛴ(Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;I)Ljava/lang/String;
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p1, v1

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x4

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v1

    .line 12
    :cond_1
    invoke-static {p0, p1, p2, v1}, Lyyds/ᛲᲁᲈ;->ᛶᛸᲀᲁ(Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;Ljava/lang/Integer;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic ᛶᛳᛶᛵ(Landroid/view/View;ILyyds/ᛱᲁᛵᛸ;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, v0}, Lyyds/ᛲᲁᲈ;->ᲇᛱᛲ(Landroid/view/View;ILyyds/ᛱᲁᛵᛸ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static native ᛶᛸᲀᲁ(Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;Ljava/lang/Integer;)Ljava/lang/String;
.end method

.method public static native ᛶᲈᛴᲈ(Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/Integer;)Ljava/io/File;
.end method

.method public static native ᛷᛸᲇᛶ(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native ᛸᛸᛷᛱ(Landroid/content/Context;Lyyds/ᛵᲇᛵᲇ;)V
.end method

.method public static native ᲀᛲᛱᛱ(Landroid/content/Context;)V
.end method

.method public static native ᲀᛴᲁᲈ(Landroid/content/Context;)V
.end method

.method public static native ᲇᛱᛲ(Landroid/view/View;ILyyds/ᛱᲁᛵᛸ;Lyyds/ᛷᛴᲈᲀ;)V
.end method

.method public static native ᲈᲀᛲᲀ()Ljava/lang/String;
.end method


# virtual methods
.method public native ᛱᲈᲁ(Ljava/lang/Object;Ljava/io/File;Lyyds/ᛴᛳᲀᲈ;)Z
.end method

.method public native ᛲᛲᲈᲈ(Lyyds/ᛳᛷᲀᛴ;)Lyyds/ᛴᛷᛷ;
.end method

.method public native ᛲᛳᛶᲁ()Ljava/lang/Object;
.end method

.method public native ᛲᛴᛳᛲ([B)Ljava/lang/Object;
.end method

.method public native ᛲᛶᛱᲈ(Landroid/content/Context;)Lcom/ss/android/ugc/awemes/WardDatabase;
.end method

.method public native ᛲᲈᲁ()Ljava/lang/Class;
.end method

.method public native ᛳᲁᲁᲇ(Lyyds/ᛴᛳᲀᲈ;)I
.end method

.method public native ᛵᛸᛸᛷ(Lyyds/ᛴᛴᛵᛸ;Z)V
.end method

.method public native ᛶᛷᛲᲁ(Ljava/lang/String;Ljava/lang/StringBuilder;)V
.end method

.method public native ᛷᛲᲈᛱ(ILjava/lang/Object;)V
.end method

.method public native ᛷᛵᲇᲀ(Ljava/lang/Object;)Z
.end method

.method public native ᛷᲈᲈᲁ()V
.end method

.method public native ᲀᛲᛲᲇ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public native ᲀᛲᛳᲀ(Lyyds/ᛴᛴᛵᛸ;)Z
.end method

.method public native ᲇᲇᲇᛱ(Lyyds/ᲁᛱᛸᛵ;Lyyds/ᛴᛳᲀᲈ;)Lyyds/ᲁᛱᛸᛵ;
.end method

.method public native ᲇᲈᛵᛷ(Lyyds/ᛶᛶᲈᛷ;Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᲀᲁᲁ;
.end method
