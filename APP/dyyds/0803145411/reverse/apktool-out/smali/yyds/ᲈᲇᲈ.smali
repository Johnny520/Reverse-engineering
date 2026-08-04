.class public final synthetic Lyyds/ᲈᲇᲈ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x70

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(ILandroid/app/Dialog;Landroid/content/Context;Lcom/ss/android/ugc/aweme/comment/model/Comment;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᲈᲇᲈ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lyyds/ᲈᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lyyds/ᲈᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 10
    .line 11
    iput p1, p0, Lyyds/ᲈᲇᲈ;->ᲇᲈᛵᛷ:I

    .line 12
    .line 13
    iput-object p3, p0, Lyyds/ᲈᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛱᛴᛱᲀ;Lyyds/ᛱᛷᛸᲈ;Lyyds/ᲇᲁᛷᛵ;Landroid/content/Context;I)V
    .locals 0

    .line 16
    const/4 p4, 0x2

    iput p4, p0, Lyyds/ᲈᲇᲈ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᲈᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᲈᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᲈᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    iput p5, p0, Lyyds/ᲈᲇᲈ;->ᲇᲈᛵᛷ:I

    return-void
.end method

.method public native synthetic constructor <init>(Lyyds/ᛶᛱᲀᲀ;Lyyds/ᛵᛷᛱᛵ;Lyyds/ᲇᛸᛲᛵ;I)V
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
