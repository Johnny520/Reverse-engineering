.class public final Lyyds/ᲇᛳᲇ;
.super Lyyds/ᛸᲀᛷᛱ;

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public ᛱᲈᲁ:I

.field public final synthetic ᛲᛳᛶᲁ:Landroid/content/Context;

.field public final synthetic ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᲈᲈᲁ:Lcom/ss/android/ugc/aweme/feed/model/Aweme;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x112

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 1
    iput p4, p0, Lyyds/ᲇᛳᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲇᛳᲇ;->ᛲᛳᛶᲁ:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲇᛳᲇ;->ᛷᲈᲈᲁ:Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final native ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final native ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
.end method

.method public final native ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method
