.class public final synthetic Lyyds/ᛵᛴᛷ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛵᛶᲇᲇ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Landroid/app/Dialog;

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛷᛴᛱᛱ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x48

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛷᛴᛱᛱ;Lyyds/ᛵᛶᲇᲇ;Landroid/app/Dialog;I)V
    .locals 0

    .line 1
    iput p4, p0, Lyyds/ᛵᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᛴᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛴᛱᛱ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛵᛴᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛵᛶᲇᲇ;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛵᛴᛷ;->ᲇᲇᲇᛱ:Landroid/app/Dialog;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
