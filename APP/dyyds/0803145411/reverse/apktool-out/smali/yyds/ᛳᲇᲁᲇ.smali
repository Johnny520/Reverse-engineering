.class public final synthetic Lyyds/ᛳᲇᲁᲇ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛷ;

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲈᲁᛸᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛶᲀᲈᛷ;Lyyds/ᲈᲁᛸᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᲇᲁᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛷ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛳᲇᲁᲇ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲁᛸᲈ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final native onDismiss(Landroid/content/DialogInterface;)V
.end method
