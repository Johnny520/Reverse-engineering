.class public final Lyyds/ᛶᛵᛲᛲ;
.super Ljava/lang/Object;


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

.field public static final ᛵᛸᛸᛷ:Lyyds/ᛱᛲᛶᛱ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x81

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    .line 1
    new-instance v0, Lyyds/ᛶᛵᛲᛲ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 7
    .line 8
    new-instance v0, Lyyds/ᲁᲀᛳ;

    .line 9
    .line 10
    const/16 v1, 0x1a

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lyyds/ᲁᲀᛳ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lyyds/ᛱᛲᛶᛱ;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lyyds/ᛶᛵᛲᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 21
    .line 22
    return-void
.end method

.method public static native ᛱᲈᲁ(Landroid/content/Context;Ljava/lang/String;)V
.end method

.method public static native ᛲᛳᛶᲁ(Landroid/content/Context;)V
.end method

.method public static native ᛲᛴᛳᛲ()Lyyds/ᛶᛲᛷ;
.end method

.method public static native ᛶᛷᛲᲁ(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;Lyyds/ᛲᛱᛶᛸ;I)Ljava/lang/Object;
.end method

.method public static native ᲀᛲᛳᲀ(Ljava/util/List;)Ljava/lang/String;
.end method

.method public static native ᲇᲈᛵᛷ(Ljava/lang/String;)Ljava/lang/String;
.end method


# virtual methods
.method public final native ᛲᲈᲁ([BLjava/lang/String;Landroid/content/Context;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/io/Serializable;
.end method

.method public final native ᛵᛸᛸᛷ(Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;Ljava/lang/Integer;Landroid/content/Context;ZZLyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
.end method

.method public final native ᲇᲇᲇᛱ(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/comment/model/Comment;Ljava/lang/Integer;ZLyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
.end method
