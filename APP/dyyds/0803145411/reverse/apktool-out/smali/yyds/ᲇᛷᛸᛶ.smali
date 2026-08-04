.class public final synthetic Lyyds/ᲇᛷᛸᛶ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛵᲀᛷᛷ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd1

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛵᲀᛷᛷ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲇᛷᛸᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲇᛷᛸᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲀᛷᛷ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
