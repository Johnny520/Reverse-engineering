.class public final synthetic Lyyds/ᲈᛲᲇ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:Landroid/app/Dialog;

.field public final synthetic ᛵᛸᛸᛷ:Lyyds/ᲀᛵᲁᛴ;

.field public final synthetic ᲀᛲᛳᲀ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x25

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Dialog;Lyyds/ᲀᛵᲁᛴ;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛲᲇ;->ᛲᲈᲁ:Landroid/app/Dialog;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᛲᲇ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛵᲁᛴ;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲈᛲᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᲈᛲᲇ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final native onShow(Landroid/content/DialogInterface;)V
.end method
