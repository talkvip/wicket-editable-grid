package codetroopers.wicket.web.datagrid.component;

import org.apache.wicket.markup.repeater.Item;
/**
 * 
 * @author Nadeem Mohammad
 *
 */
public interface IItemRefreashable<T>
{	
	void refreash(Item<T> item);
}
