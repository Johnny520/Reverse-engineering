.class public final synthetic Lyyds/ᛴᛳᛷᛴ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/content/Context;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Landroid/app/Dialog;

.field public final synthetic ᲇᲈᛵᛷ:Lcom/ss/android/ugc/aweme/comment/model/Comment;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6a

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(ILandroid/app/Dialog;Landroid/content/Context;Lcom/ss/android/ugc/aweme/comment/model/Comment;)V
    .locals 0

    .line 14
    iput p1, p0, Lyyds/ᛴᛳᛷᛴ;->ᲀᛲᛳᲀ:I

    iput-object p4, p0, Lyyds/ᛴᛳᛷᛴ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

    iput-object p3, p0, Lyyds/ᛴᛳᛷᛴ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    iput-object p2, p0, Lyyds/ᛴᛳᛷᛴ;->ᲇᲇᲇᛱ:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/ss/android/ugc/aweme/comment/model/Comment;Landroid/app/Dialog;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lyyds/ᛴᛳᛷᛴ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛴᛳᛷᛴ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᛴᛳᛷᛴ;->ᲇᲈᛵᛷ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 10
    .line 11
    iput-object p3, p0, Lyyds/ᛴᛳᛷᛴ;->ᲇᲇᲇᛱ:Landroid/app/Dialog;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
