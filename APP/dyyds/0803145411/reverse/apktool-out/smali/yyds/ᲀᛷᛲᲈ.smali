.class public final synthetic Lyyds/ᲀᛷᛲᲈ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/content/Context;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Landroid/widget/TextView;

.field public final synthetic ᲇᲈᛵᛷ:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xac

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;Landroid/content/Context;Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    iput p4, p0, Lyyds/ᲀᛷᛲᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲀᛷᛲᲈ;->ᲇᲈᛵᛷ:Landroid/view/View;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲀᛷᛲᲈ;->ᛲᛴᛳᛲ:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᲀᛷᛲᲈ;->ᲇᲇᲇᛱ:Landroid/widget/TextView;

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
