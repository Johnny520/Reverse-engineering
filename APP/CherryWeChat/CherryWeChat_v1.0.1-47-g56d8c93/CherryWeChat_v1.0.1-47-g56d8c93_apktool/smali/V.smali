.class public final LV;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final e:LV;

.field public static final f:LV;

.field public static final g:LV;

.field public static final h:LV;

.field public static final i:LV;

.field public static final j:LV;

.field public static final k:LV;

.field public static final l:LV;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I

.field public final c:Ljava/lang/Class;

.field public final d:Lk0;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v0, LV;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV;-><init>(ILjava/lang/String;)V

    new-instance v0, LV;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v2}, LV;-><init>(ILjava/lang/String;)V

    new-instance v0, LV;

    const/4 v1, 0x4

    invoke-direct {v0, v1, v2}, LV;-><init>(ILjava/lang/String;)V

    new-instance v0, LV;

    const/16 v1, 0x8

    invoke-direct {v0, v1, v2}, LV;-><init>(ILjava/lang/String;)V

    new-instance v0, LV;

    const/16 v1, 0x10

    invoke-direct {v0, v1, v2}, LV;-><init>(ILjava/lang/String;)V

    sput-object v0, LV;->e:LV;

    new-instance v0, LV;

    const/16 v1, 0x20

    invoke-direct {v0, v1, v2}, LV;-><init>(ILjava/lang/String;)V

    new-instance v0, LV;

    const/16 v3, 0x40

    invoke-direct {v0, v3, v2}, LV;-><init>(ILjava/lang/String;)V

    new-instance v0, LV;

    const/16 v3, 0x80

    invoke-direct {v0, v3, v2}, LV;-><init>(ILjava/lang/String;)V

    new-instance v0, LV;

    const/16 v3, 0x100

    const-class v4, Ld0;

    invoke-direct {v0, v3, v4}, LV;-><init>(ILjava/lang/Class;)V

    new-instance v0, LV;

    const/16 v3, 0x200

    invoke-direct {v0, v3, v4}, LV;-><init>(ILjava/lang/Class;)V

    new-instance v0, LV;

    const/16 v3, 0x400

    const-class v4, Le0;

    invoke-direct {v0, v3, v4}, LV;-><init>(ILjava/lang/Class;)V

    new-instance v0, LV;

    const/16 v3, 0x800

    invoke-direct {v0, v3, v4}, LV;-><init>(ILjava/lang/Class;)V

    new-instance v0, LV;

    const/16 v3, 0x1000

    invoke-direct {v0, v3, v2}, LV;-><init>(ILjava/lang/String;)V

    sput-object v0, LV;->f:LV;

    new-instance v0, LV;

    const/16 v3, 0x2000

    invoke-direct {v0, v3, v2}, LV;-><init>(ILjava/lang/String;)V

    sput-object v0, LV;->g:LV;

    new-instance v0, LV;

    const/16 v3, 0x4000

    invoke-direct {v0, v3, v2}, LV;-><init>(ILjava/lang/String;)V

    new-instance v0, LV;

    const v3, 0x8000

    invoke-direct {v0, v3, v2}, LV;-><init>(ILjava/lang/String;)V

    new-instance v0, LV;

    const/high16 v3, 0x10000

    invoke-direct {v0, v3, v2}, LV;-><init>(ILjava/lang/String;)V

    new-instance v0, LV;

    const/high16 v3, 0x20000

    const-class v4, Li0;

    invoke-direct {v0, v3, v4}, LV;-><init>(ILjava/lang/Class;)V

    new-instance v0, LV;

    const/high16 v3, 0x40000

    invoke-direct {v0, v3, v2}, LV;-><init>(ILjava/lang/String;)V

    sput-object v0, LV;->h:LV;

    new-instance v0, LV;

    const/high16 v3, 0x80000

    invoke-direct {v0, v3, v2}, LV;-><init>(ILjava/lang/String;)V

    sput-object v0, LV;->i:LV;

    new-instance v0, LV;

    const/high16 v3, 0x100000

    invoke-direct {v0, v3, v2}, LV;-><init>(ILjava/lang/String;)V

    sput-object v0, LV;->j:LV;

    new-instance v0, LV;

    const/high16 v3, 0x200000

    const-class v4, Lj0;

    invoke-direct {v0, v3, v4}, LV;-><init>(ILjava/lang/Class;)V

    new-instance v5, LV;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v6, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SHOW_ON_SCREEN:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v7, 0x1020036

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v11, LV;

    sget-object v12, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_TO_POSITION:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const/4 v15, 0x0

    const-class v16, Lg0;

    const v13, 0x1020037

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v3, LV;

    sget-object v4, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_UP:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const/4 v7, 0x0

    const v5, 0x1020038

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    sput-object v3, LV;->k:LV;

    new-instance v4, LV;

    sget-object v5, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_LEFT:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v6, 0x1020039

    invoke-direct/range {v4 .. v9}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v10, LV;

    sget-object v11, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_DOWN:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v12, 0x102003a

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    sput-object v10, LV;->l:LV;

    new-instance v3, LV;

    sget-object v4, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_RIGHT:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const v5, 0x102003b

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v9, LV;

    const/16 v3, 0x1d

    if-lt v0, v3, :cond_0

    invoke-static {}, LQ;->l()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v4

    move-object v10, v4

    goto :goto_0

    :cond_0
    move-object v10, v2

    :goto_0
    const/4 v13, 0x0

    const/4 v14, 0x0

    const v11, 0x1020046

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v15, LV;

    if-lt v0, v3, :cond_1

    invoke-static {}, LQ;->w()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v4

    move-object/from16 v16, v4

    goto :goto_1

    :cond_1
    move-object/from16 v16, v2

    :goto_1
    const/16 v19, 0x0

    const/16 v20, 0x0

    const v17, 0x1020047

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v4, LV;

    if-lt v0, v3, :cond_2

    invoke-static {}, LQ;->A()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v2

    :goto_2
    const/4 v8, 0x0

    const/4 v9, 0x0

    const v6, 0x1020048

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v10, LV;

    if-lt v0, v3, :cond_3

    invoke-static {}, LQ;->D()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v3

    move-object v11, v3

    goto :goto_3

    :cond_3
    move-object v11, v2

    :goto_3
    const/4 v14, 0x0

    const/4 v15, 0x0

    const v12, 0x1020049

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v3, LV;

    sget-object v4, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_CONTEXT_CLICK:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v5, 0x102003c

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v9, LV;

    sget-object v10, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SET_PROGRESS:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const-class v14, Lh0;

    const v11, 0x102003d

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v3, LV;

    sget-object v4, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_MOVE_WINDOW:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const-class v8, Lf0;

    const v5, 0x1020042

    invoke-direct/range {v3 .. v8}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v9, LV;

    sget-object v10, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SHOW_TOOLTIP:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const/4 v14, 0x0

    const v11, 0x1020044

    invoke-direct/range {v9 .. v14}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v3, LV;

    sget-object v4, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_HIDE_TOOLTIP:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    const/4 v8, 0x0

    const v5, 0x1020045

    invoke-direct/range {v3 .. v8}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v9, LV;

    const/16 v3, 0x1e

    if-lt v0, v3, :cond_4

    invoke-static {}, LS;->l()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v4

    move-object v10, v4

    goto :goto_4

    :cond_4
    move-object v10, v2

    :goto_4
    const/4 v13, 0x0

    const/4 v14, 0x0

    const v11, 0x102004a

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v15, LV;

    if-lt v0, v3, :cond_5

    invoke-static {}, LS;->w()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v3

    move-object/from16 v16, v3

    goto :goto_5

    :cond_5
    move-object/from16 v16, v2

    :goto_5
    const/16 v19, 0x0

    const/16 v20, 0x0

    const v17, 0x1020054

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v3, LV;

    if-lt v0, v1, :cond_6

    invoke-static {}, LT;->a()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v4

    goto :goto_6

    :cond_6
    move-object v4, v2

    :goto_6
    const/4 v7, 0x0

    const/4 v8, 0x0

    const v5, 0x1020055

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v9, LV;

    if-lt v0, v1, :cond_7

    invoke-static {}, LT;->b()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v3

    move-object v10, v3

    goto :goto_7

    :cond_7
    move-object v10, v2

    :goto_7
    const/4 v13, 0x0

    const/4 v14, 0x0

    const v11, 0x1020056

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v3, LV;

    if-lt v0, v1, :cond_8

    invoke-static {}, LT;->c()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v1

    move-object v4, v1

    goto :goto_8

    :cond_8
    move-object v4, v2

    :goto_8
    const/4 v7, 0x0

    const/4 v8, 0x0

    const v5, 0x1020057

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v9, LV;

    const/16 v1, 0x21

    if-lt v0, v1, :cond_9

    invoke-static {}, LU;->b()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v1

    move-object v10, v1

    goto :goto_9

    :cond_9
    move-object v10, v2

    :goto_9
    const/4 v13, 0x0

    const/4 v14, 0x0

    const v11, 0x1020058

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    new-instance v3, LV;

    const/16 v1, 0x22

    if-lt v0, v1, :cond_a

    invoke-static {}, LY;->a()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    move-result-object v2

    :cond_a
    move-object v4, v2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v5, 0x102005e

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Class;)V
    .locals 6

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p1

    move-object v5, p2

    .line 2
    invoke-direct/range {v0 .. v5}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    .line 1
    invoke-direct/range {v0 .. v5}, LV;-><init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILjava/lang/CharSequence;Lk0;Ljava/lang/Class;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p2, p0, LV;->b:I

    .line 5
    iput-object p4, p0, LV;->d:Lk0;

    if-nez p1, :cond_0

    .line 6
    new-instance p1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-direct {p1, p2, p3}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    iput-object p1, p0, LV;->a:Ljava/lang/Object;

    goto :goto_0

    .line 7
    :cond_0
    iput-object p1, p0, LV;->a:Ljava/lang/Object;

    .line 8
    :goto_0
    iput-object p5, p0, LV;->c:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, LV;->a:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getId()I

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LV;

    if-nez v1, :cond_1

    return v0

    :cond_1
    check-cast p1, LV;

    iget-object p1, p1, LV;->a:Ljava/lang/Object;

    iget-object v1, p0, LV;->a:Ljava/lang/Object;

    if-nez v1, :cond_2

    if-eqz p1, :cond_3

    return v0

    :cond_2
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LV;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AccessibilityActionCompat: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, LV;->b:I

    invoke-static {v1}, La0;->d(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ACTION_UNKNOWN"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LV;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getLabel()Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getLabel()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
